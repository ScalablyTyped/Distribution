organization := "org.scalablytyped"
name := "uifabric__icons"
version := "6.5.1-971f7e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-61d3d0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-7e744c",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-5f45a9",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "6.17.0-ba1d26",
  "org.scalablytyped" %%% "uifabric__styling" % "6.46.0-78d3f1",
  "org.scalablytyped" %%% "uifabric__utilities" % "6.35.5-db6da9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        