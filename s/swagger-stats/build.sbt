organization := "org.scalablytyped"
name := "swagger-stats"
version := "0.95-dt-20220609Z-522cbe"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-96c572",
  "org.scalablytyped" %%% "buffer" % "6.0.3-053422",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-cb1e35",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-5f1c10",
  "org.scalablytyped" %%% "fast-json-stringify" % "5.4.0-6a76d8",
  "org.scalablytyped" %%% "fastify" % "4.9.2-7e810a",
  "org.scalablytyped" %%% "fastify__ajv-compiler" % "3.3.1-990929",
  "org.scalablytyped" %%% "fastify__error" % "3.0.0-066829",
  "org.scalablytyped" %%% "fastify__fast-json-stringify-compiler" % "4.1.0-bf820e",
  "org.scalablytyped" %%% "find-my-way" % "7.3.1-07a138",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.0-783f73",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20211202Z-bc591b",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20221019Z-353fc4",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.0-998f17",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.0-31fcc8",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.0-2f55b3",
  "org.scalablytyped" %%% "joi" % "17.7.0-7c28f2",
  "org.scalablytyped" %%% "light-my-request" % "5.6.1-751b70",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-85c9dc",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "pino" % "8.7.0-3f0d6e",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-02af79",
  "org.scalablytyped" %%% "prom-client" % "14.1.0-fcae78",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-137229",
  "org.scalablytyped" %%% "re2" % "1.17.7-41dbc1",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-d3379f",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-23665c",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-4bb631")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
