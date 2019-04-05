organization := "org.scalablytyped"
name := "typed-github-api"
version := "1.2.6-e5d382"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-7b85eb",
  "org.scalablytyped" %%% "blow-http-statuses" % "0.2.4-581d8d",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-249d28",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-53c35c",
  "org.scalablytyped" %%% "crypto-js" % "v3.1.8-dt-20190322Z-372544",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-33b861",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-c31b2e",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-0a0b93",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-54f634",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-2631f3",
  "org.scalablytyped" %%% "moment" % "2.24.0-da0e25",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "node-fetch" % "2.3-dt-20190403Z-8a4c08",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-dea611",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-623d43",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-fea888",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-5d06ef",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-201a01",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20190322Z-ad49e2",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-5108a8",
  "org.scalablytyped" %%% "typescript-event-handler" % "1.0.0-2e7ada",
  "org.scalablytyped" %%% "winston" % "3.2.1-0ba935",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-01faf0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        