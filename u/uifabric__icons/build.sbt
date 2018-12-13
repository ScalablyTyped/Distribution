organization := "org.scalablytyped"
name := "uifabric__icons"
version := "6.3.0-1d3d5a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-939493",
  "org.scalablytyped" %%% "microsoft__load-themed-styles" % "1.8.49-3db1c0",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-7481e3",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181213Z-296d60",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-c9a723",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "tslib" % "1.9.3-13238d",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "6.15.0-6319fa",
  "org.scalablytyped" %%% "uifabric__set-version" % "1.1.3-37da8d",
  "org.scalablytyped" %%% "uifabric__styling" % "6.39.0-78208c",
  "org.scalablytyped" %%% "uifabric__utilities" % "6.27.0-3a1c53")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        