organization := "org.scalablytyped"
name := "swagger-stats"
version := "0.95-dt-20220609Z-522fb0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-3b5adf",
  "org.scalablytyped" %%% "buffer" % "6.0.3-61ce95",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-2966c9",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-5cc384",
  "org.scalablytyped" %%% "fast-json-stringify" % "5.4.0-3b66bb",
  "org.scalablytyped" %%% "fastify" % "4.9.2-aaa09a",
  "org.scalablytyped" %%% "fastify__ajv-compiler" % "3.3.1-888c52",
  "org.scalablytyped" %%% "fastify__error" % "3.0.0-aaa9d0",
  "org.scalablytyped" %%% "fastify__fast-json-stringify-compiler" % "4.1.0-cf9099",
  "org.scalablytyped" %%% "find-my-way" % "7.3.1-e42cb7",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.0-895c47",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20211202Z-b7f2fb",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20221019Z-d227c2",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.0-abe48a",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.0-ea4c5d",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.0-e71e9e",
  "org.scalablytyped" %%% "joi" % "17.7.0-985b45",
  "org.scalablytyped" %%% "light-my-request" % "5.6.1-32445d",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-4d0efa",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "pino" % "8.7.0-6401a9",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-9f97c5",
  "org.scalablytyped" %%% "prom-client" % "14.1.0-1a49d1",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-fa36ba",
  "org.scalablytyped" %%% "re2" % "1.17.7-7b689a",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-088887",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-f57a6f",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-9ebd39")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
