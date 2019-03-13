organization := "org.scalablytyped"
name := "winston-mail"
version := "1.5-dt-20181019Z-25eefa"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-21c6be",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-6e9117",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-4841be",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-6dcdf6",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-b635c8",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-fef2c2",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-8bbfec",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-c1833f",
  "org.scalablytyped" %%% "winston" % "3.2.1-275f17",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-6bb921")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        