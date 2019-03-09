organization := "org.scalablytyped"
name := "uifabric__icons"
version := "6.4.0-e69c34"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-60f3ea",
  "org.scalablytyped" %%% "microsoft__load-themed-styles" % "1.8.64-268ef0",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-0b0b5e",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190306Z-d5c6e1",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-768022",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "tslib" % "1.9.3-d28c21",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "6.16.1-7960b7",
  "org.scalablytyped" %%% "uifabric__set-version" % "1.1.3-1cbc14",
  "org.scalablytyped" %%% "uifabric__styling" % "6.44.1-4beb0a",
  "org.scalablytyped" %%% "uifabric__utilities" % "6.34.0-a7c5e5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        