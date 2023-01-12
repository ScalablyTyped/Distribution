organization := "org.scalablytyped"
name := "swagger-stats"
version := "0.95-dt-20220609Z-a4936b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-e03df2",
  "org.scalablytyped" %%% "buffer" % "6.0.3-34b6a7",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-118d16",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-e830b8",
  "org.scalablytyped" %%% "fast-json-stringify" % "5.4.0-892982",
  "org.scalablytyped" %%% "fastify" % "4.9.2-539430",
  "org.scalablytyped" %%% "fastify__ajv-compiler" % "3.3.1-81937e",
  "org.scalablytyped" %%% "fastify__error" % "3.0.0-b8c599",
  "org.scalablytyped" %%% "fastify__fast-json-stringify-compiler" % "4.1.0-adc441",
  "org.scalablytyped" %%% "find-my-way" % "7.3.1-ea12e6",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.0-e943fd",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20211202Z-35b843",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20221019Z-8d60cc",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.0-bdfda0",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.0-e1b709",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.0-dab5bb",
  "org.scalablytyped" %%% "joi" % "17.7.0-c612b4",
  "org.scalablytyped" %%% "light-my-request" % "5.6.1-3b9a22",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-381f52",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "pino" % "8.7.0-b181b2",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-145026",
  "org.scalablytyped" %%% "prom-client" % "14.1.0-ad0e13",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-625bd0",
  "org.scalablytyped" %%% "re2" % "1.17.7-31fc73",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-5be9af",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-df3c84",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-8d8221")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
