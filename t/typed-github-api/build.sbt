organization := "org.scalablytyped"
name := "typed-github-api"
version := "1.2.6-30d4ad"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-ca81e9",
  "org.scalablytyped" %%% "blow-http-statuses" % "0.2.4-c48acd",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-40b8d3",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-50c57a",
  "org.scalablytyped" %%% "crypto-js" % "v3.1.8-dt-20180725Z-a1375e",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-42d72c",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-ab47ea",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-4ad75e",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-640fda",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "moment" % "2.24.0-22f1d2",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-604ea6",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-ae8c41",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-d1795e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c7c39d",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-ee2b7e",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-77ecd6",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-fa6869",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-2f7239",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-becbe4",
  "org.scalablytyped" %%% "typescript-event-handler" % "1.0.0-3bb6f5",
  "org.scalablytyped" %%% "winston" % "3.2.1-083c5e",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-3b7cc4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        