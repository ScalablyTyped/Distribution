organization := "org.scalablytyped"
name := "typed-github-api"
version := "1.2.6-13cc3c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190117Z-ca81e9",
  "org.scalablytyped" %%% "blow-http-statuses" % "0.2.4-c48acd",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-cbd349",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-fc559d",
  "org.scalablytyped" %%% "crypto-js" % "v3.1.8-dt-20180725Z-a1375e",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-593054",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-12a485",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-d75fef",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-640fda",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "moment" % "2.24.0-22f1d2",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-9f73ab",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190130Z-9a96a4",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-d1795e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c7c39d",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-ad4db2",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-3914b1",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-ed7327",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-2f7239",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-becbe4",
  "org.scalablytyped" %%% "typescript-event-handler" % "1.0.0-3bb6f5",
  "org.scalablytyped" %%% "winston" % "3.2.1-1b5e93",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-27b45f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        