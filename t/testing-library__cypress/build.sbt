organization := "org.scalablytyped"
name := "testing-library__cypress"
version := "5.0-dt-20200401Z-a7cb9f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20200415Z-e1b00b",
  "org.scalablytyped" %%% "pretty-format" % "25.3.0-355595",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-ca8578",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "testing-library__dom" % "7.0-dt-20200401Z-940f64")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
