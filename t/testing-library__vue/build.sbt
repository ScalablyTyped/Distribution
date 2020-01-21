organization := "org.scalablytyped"
name := "testing-library__vue"
version := "2.0-dt-20190816Z-80e59e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "pretty-format" % "24.9.0-ba4448",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "testing-library__dom" % "6.11-dt-20200102Z-32ef56",
  "org.scalablytyped" %%% "vue" % "2.6.11-0c006a",
  "org.scalablytyped" %%% "vue-router" % "3.1.5-edd5a2",
  "org.scalablytyped" %%% "vuex" % "3.1.2-4b4ecb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        