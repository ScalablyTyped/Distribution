organization := "org.scalablytyped"
name := "uifabric__icons"
version := "6.5.0-79209b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-9dec0a",
  "org.scalablytyped" %%% "microsoft__load-themed-styles" % "1.8.73-ab4875",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-1549d2",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190322Z-acd0bd",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190322Z-84fa90",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "tslib" % "1.9.3-f320f9",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "6.16.1-db9205",
  "org.scalablytyped" %%% "uifabric__set-version" % "1.1.3-70527e",
  "org.scalablytyped" %%% "uifabric__styling" % "6.45.0-01b82d",
  "org.scalablytyped" %%% "uifabric__utilities" % "6.35.1-f5f9c5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        