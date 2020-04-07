organization := "org.scalablytyped"
name := "testing-library__cypress"
version := "5.0-dt-20200203Z-1725d2"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cypress" % "4.2.0-e50af3",
  "org.scalablytyped" %%% "eventemitter2" % "6.2.1-37a8bd",
  "org.scalablytyped" %%% "moment" % "2.24.0-b112e6",
  "org.scalablytyped" %%% "pretty-format" % "25.1.0-9e065e",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-3d9ead",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "testing-library__dom" % "6.14-dt-20200309Z-9e8902")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
