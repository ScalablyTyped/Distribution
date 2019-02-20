organization := "org.scalablytyped"
name := "yog2-kernel"
version := "1.9-dt-20181121Z-ed601c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-40b8d3",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-50c57a",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-42d72c",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-ab47ea",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-cf3a73",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-604ea6",
  "org.scalablytyped" %%% "node-ral" % "0.18-dt-20181121Z-4b6e5d",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c7c39d",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-fa6869",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "yog-bigpipe" % "0.4-dt-20180214Z-092275",
  "org.scalablytyped" %%% "yog-log" % "0.1-dt-20181121Z-00aa42")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        