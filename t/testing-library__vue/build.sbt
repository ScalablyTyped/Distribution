organization := "org.scalablytyped"
name := "testing-library__vue"
version := "2.0-dt-20190816Z-48487d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "pretty-format" % "24.9.0-692341",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "testing-library__dom" % "6.10-dt-20191101Z-611f29",
  "org.scalablytyped" %%% "vue" % "2.6.10-8eb705",
  "org.scalablytyped" %%% "vue-router" % "3.1.3-5b3600",
  "org.scalablytyped" %%% "vuex" % "3.1.2-f45609")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        