organization := "org.scalablytyped"
name := "testing-library__cypress"
version := "5.0-dt-20191024Z-f8724f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cypress" % "3.7.0-653cf8",
  "org.scalablytyped" %%% "moment" % "2.24.0-534f7e",
  "org.scalablytyped" %%% "pretty-format" % "24.9.0-692341",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-2d253b",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "testing-library__dom" % "6.10-dt-20191101Z-611f29")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        