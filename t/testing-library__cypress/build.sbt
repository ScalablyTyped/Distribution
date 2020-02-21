organization := "org.scalablytyped"
name := "testing-library__cypress"
version := "5.0-dt-20200203Z-1553bc"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cypress" % "3.8.3-ac3683",
  "org.scalablytyped" %%% "eventemitter2" % "5.0.1-d28ccd",
  "org.scalablytyped" %%% "moment" % "2.24.0-8b2e89",
  "org.scalablytyped" %%% "pretty-format" % "24.9.0-c68b79",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-a68146",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "testing-library__dom" % "6.12-dt-20200210Z-faeec2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
