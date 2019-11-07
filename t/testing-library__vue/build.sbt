organization := "org.scalablytyped"
name := "testing-library__vue"
version := "2.0-dt-20190816Z-95d154"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "pretty-format" % "24.9.0-681723",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "testing-library__dom" % "6.10-dt-20191101Z-cdbe98",
  "org.scalablytyped" %%% "vue" % "2.6.10-71f5d7",
  "org.scalablytyped" %%% "vue-router" % "3.1.3-e8bded",
  "org.scalablytyped" %%% "vuex" % "3.1.1-9894e9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        