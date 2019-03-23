organization := "org.scalablytyped"
name := "svg-sprite"
version := "0.0-unknown-dt-20190322Z-8adfbd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-21c6be",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-e3e6bc",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-4841be",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190322Z-28a0c1",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-6dcdf6",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-99190d",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-95714e",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20190322Z-8bbfec",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-c1833f",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-8e1d04",
  "org.scalablytyped" %%% "winston" % "3.2.1-6b1983",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-1ebc32")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        