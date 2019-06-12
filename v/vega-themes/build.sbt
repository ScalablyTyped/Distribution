organization := "org.scalablytyped"
name := "vega-themes"
version := "2.3.0-5f9ab0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "json-stable-stringify" % "1.0-dt-20180214Z-239a1a",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "vega-lite" % "2.6.0-ba07bd",
  "org.scalablytyped" %%% "vega-typings" % "0.7.1-14153f",
  "org.scalablytyped" %%% "vega-util" % "1.10.0-110b8b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        