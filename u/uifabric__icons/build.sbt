organization := "org.scalablytyped"
name := "uifabric__icons"
version := "6.5.1-b4b4d0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "microsoft__load-themed-styles" % "1.8.82-21c6ab",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190408Z-6fa8bf",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-3351b3",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190322Z-511913",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "tslib" % "1.9.3-446b32",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "6.16.4-84fbcd",
  "org.scalablytyped" %%% "uifabric__set-version" % "1.1.3-32789d",
  "org.scalablytyped" %%% "uifabric__styling" % "6.45.2-fd5c7a",
  "org.scalablytyped" %%% "uifabric__utilities" % "6.35.3-5d5af6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        