organization := "org.scalablytyped"
name := "swagger-stats"
version := "0.95-dt-20220609Z-0f06d0"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-7e3772",
  "org.scalablytyped" %%% "buffer" % "6.0.3-3c44f1",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-646db4",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-53b851",
  "org.scalablytyped" %%% "fast-json-stringify" % "5.3.0-aaffb0",
  "org.scalablytyped" %%% "fastify" % "4.6.0-58eae6",
  "org.scalablytyped" %%% "fastify__ajv-compiler" % "3.3.1-0e0874",
  "org.scalablytyped" %%% "fastify__error" % "3.0.0-651389",
  "org.scalablytyped" %%% "fastify__fast-json-stringify-compiler" % "4.1.0-33d153",
  "org.scalablytyped" %%% "find-my-way" % "7.2.0-fe6a19",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.0-680d7d",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20211202Z-45b641",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20220525Z-b2ba33",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.0-dcfbb6",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.0-7190cd",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.0-7d50fe",
  "org.scalablytyped" %%% "joi" % "17.6.2-2be84d",
  "org.scalablytyped" %%% "light-my-request" % "5.6.1-0b28a4",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-fb8f3f",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "pino" % "8.6.1-0a83e2",
  "org.scalablytyped" %%% "pino-pretty" % "4.7-dt-20220624Z-40b424",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-efc26f",
  "org.scalablytyped" %%% "prom-client" % "14.1.0-f39c70",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-4e85dc",
  "org.scalablytyped" %%% "re2" % "1.17.7-80a78e",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-170623",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-cfa707",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-6052b3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
