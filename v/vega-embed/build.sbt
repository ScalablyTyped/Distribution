organization := "org.scalablytyped"
name := "vega-embed"
version := "3.18.2-94a92e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "json-stable-stringify" % "1.0-dt-20180214Z-239a1a",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "vega-lib" % "4.4.0-f3942a",
  "org.scalablytyped" %%% "vega-lite" % "2.6.0-30e3c4",
  "org.scalablytyped" %%% "vega-tooltip" % "0.12.0-6f3e79",
  "org.scalablytyped" %%% "vega-typings" % "0.7.1-1a6d80",
  "org.scalablytyped" %%% "vega-util" % "1.10.0-8acfc3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        