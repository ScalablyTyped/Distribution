organization := "org.scalablytyped"
name := "typed-github-api"
version := "1.2.6-a6e60f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-21c6be",
  "org.scalablytyped" %%% "blow-http-statuses" % "0.2.4-aea516",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-ac6a7b",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-9339aa",
  "org.scalablytyped" %%% "crypto-js" % "v3.1.8-dt-20180725Z-99dfc9",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-6d51ab",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-0c8bec",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-2d724f",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-4841be",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "moment" % "2.24.0-1d5d22",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190319Z-4635bc",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-6cb1f3",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-6dcdf6",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5082d0",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-0e4cac",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-6cf156",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-2a152d",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-8bbfec",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-c1833f",
  "org.scalablytyped" %%% "typescript-event-handler" % "1.0.0-70eb85",
  "org.scalablytyped" %%% "winston" % "3.2.1-a9afe5",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-698fa0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        