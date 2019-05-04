organization := "org.scalablytyped"
name := "vega-lite"
version := "2.6.0-a27a01"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "json-stable-stringify" % "1.0-dt-20180214Z-8d3d8e",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "vega-typings" % "0.6.2-04578a",
  "org.scalablytyped" %%% "vega-util" % "1.10.0-eb8c07")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        