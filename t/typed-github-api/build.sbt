organization := "org.scalablytyped"
name := "typed-github-api"
version := "1.2.6-4744eb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190117Z-89bc8b",
  "org.scalablytyped" %%% "blow-http-statuses" % "0.2.4-1c9e0e",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-e9bff8",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-014b69",
  "org.scalablytyped" %%% "crypto-js" % "v3.1.8-dt-20180725Z-080b14",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180603Z-3859d1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-970fa5",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-110fbc",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-845012",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-2342ad",
  "org.scalablytyped" %%% "moment" % "2.23.0-3073eb",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-66b2ff",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-823163",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-a57469",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-70cb56",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-bb2b16",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-c3aa54",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-111f11",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-ae8e92",
  "org.scalablytyped" %%% "typescript-event-handler" % "1.0.0-4484e1",
  "org.scalablytyped" %%% "winston" % "3.1.0-1809c7",
  "org.scalablytyped" %%% "winston-transport" % "4.2.0-b44294")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        