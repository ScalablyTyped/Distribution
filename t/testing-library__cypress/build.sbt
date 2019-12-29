organization := "org.scalablytyped"
name := "testing-library__cypress"
version := "5.0-dt-20191024Z-807fa2"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cypress" % "3.8.1-591f36",
  "org.scalablytyped" %%% "moment" % "2.24.0-8ebd48",
  "org.scalablytyped" %%% "pretty-format" % "24.9.0-3b4753",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-95a8d0",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "testing-library__dom" % "6.11-dt-20191216Z-cc4c1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        