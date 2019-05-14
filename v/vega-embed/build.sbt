organization := "org.scalablytyped"
name := "vega-embed"
version := "3.18.2-5c26d0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "json-stable-stringify" % "1.0-dt-20180214Z-8d3d8e",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "vega-lib" % "4.4.0-28230f",
  "org.scalablytyped" %%% "vega-lite" % "2.6.0-985548",
  "org.scalablytyped" %%% "vega-tooltip" % "0.12.0-8dbf48",
  "org.scalablytyped" %%% "vega-typings" % "0.6.2-c88a5f",
  "org.scalablytyped" %%% "vega-util" % "1.10.0-eb8c07")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        