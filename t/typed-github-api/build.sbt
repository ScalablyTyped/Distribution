organization := "org.scalablytyped"
name := "typed-github-api"
version := "1.2.6-8195d3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181121Z-0b1654",
  "org.scalablytyped" %%% "blow-http-statuses" % "0.2.4-e2508d",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-ff0790",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-20e594",
  "org.scalablytyped" %%% "crypto-js" % "v3.1.8-dt-20180725Z-81b8f7",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180603Z-b45157",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-e60b5f",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-08022e",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-0b377c",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b5dce1",
  "org.scalablytyped" %%% "moment" % "2.23.0-9a5931",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-3aadd3",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-1d1221",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5932ee",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-967cc2",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-dbd0d6",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-d30fee",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-789604",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-6f1184",
  "org.scalablytyped" %%% "typescript-event-handler" % "1.0.0-dfeb92",
  "org.scalablytyped" %%% "winston" % "3.1.0-8122a5",
  "org.scalablytyped" %%% "winston-transport" % "4.2.0-a4f63e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        