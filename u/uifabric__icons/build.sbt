organization := "org.scalablytyped"
name := "uifabric__icons"
version := "6.4.0-4f645f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-481742",
  "org.scalablytyped" %%% "microsoft__load-themed-styles" % "1.8.62-3f2def",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-66c044",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-9e9d73",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-4ff3b1",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "tslib" % "1.9.3-9355d3",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "6.16.0-1a3db0",
  "org.scalablytyped" %%% "uifabric__set-version" % "1.1.3-1f0596",
  "org.scalablytyped" %%% "uifabric__styling" % "6.43.0-536061",
  "org.scalablytyped" %%% "uifabric__utilities" % "6.31.0-69715c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        