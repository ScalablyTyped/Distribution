organization := "org.scalablytyped"
name := "vega-embed"
version := "3.18.2-c05511"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "json-stable-stringify" % "1.0-dt-20180214Z-239a1a",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "vega-lib" % "4.4.0-8bd5b5",
  "org.scalablytyped" %%% "vega-lite" % "2.6.0-1aea95",
  "org.scalablytyped" %%% "vega-tooltip" % "0.12.0-b2643b",
  "org.scalablytyped" %%% "vega-typings" % "0.7.1-68bbe1",
  "org.scalablytyped" %%% "vega-util" % "1.10.0-3cd54c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        