organization := "org.scalablytyped"
name := "svg-sprite"
version := "0.0-unknown-dt-20181017Z-6ad213"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-85e9e1",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-346efb",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-4e8c11",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-34fdd0",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-34cfd1",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-65f44d",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-c8ed4c",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-bcda47",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-36072c",
  "org.scalablytyped" %%% "winston" % "3.2.1-13d753",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-9cbf66")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        