organization := "org.scalablytyped"
name := "testing-library__vue"
version := "2.0-dt-20190816Z-32830e"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "pretty-format" % "24.9.0-574872",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "testing-library__dom" % "6.0-dt-20190904Z-105511",
  "org.scalablytyped" %%% "vue" % "2.6.10-b372e7",
  "org.scalablytyped" %%% "vue-router" % "3.1.3-5d2432",
  "org.scalablytyped" %%% "vuex" % "3.1.1-db3dab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        