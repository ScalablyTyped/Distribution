organization := "com.scalablytyped"
name := "uifabric__utilities"
version := "6.25.0-c8fa86"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "csstype" % "2.5.7-8f5757",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20181102Z-3c49da",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181116Z-28281f",
  "com.scalablytyped" %%% "react-dom" % "16.0-dt-20181102Z-1c0420",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "tslib" % "1.9.3-89a8f4",
  "com.scalablytyped" %%% "uifabric__merge-styles" % "6.11.0-682c3c",
  "com.scalablytyped" %%% "uifabric__set-version" % "1.1.3-5c7e82",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        