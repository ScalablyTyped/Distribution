organization := "org.scalablytyped"
name := "swagger-stats"
version := "0.95-dt-20220609Z-804259"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-6f26a9",
  "org.scalablytyped" %%% "buffer" % "6.0.3-6a53bb",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-d74acb",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-06d29e",
  "org.scalablytyped" %%% "fast-json-stringify" % "5.3.0-aebbc1",
  "org.scalablytyped" %%% "fastify" % "4.9.2-28445d",
  "org.scalablytyped" %%% "fastify__ajv-compiler" % "3.3.1-b1944f",
  "org.scalablytyped" %%% "fastify__error" % "3.0.0-f97171",
  "org.scalablytyped" %%% "fastify__fast-json-stringify-compiler" % "4.1.0-4e8468",
  "org.scalablytyped" %%% "find-my-way" % "7.3.1-c39b35",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.0-7be43c",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20211202Z-830847",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20220525Z-c64a90",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.0-f3f4a7",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.0-b3ec1d",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.0-eb15ed",
  "org.scalablytyped" %%% "joi" % "17.6.3-651f50",
  "org.scalablytyped" %%% "light-my-request" % "5.6.1-5968cc",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-9884c6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "pino" % "8.6.1-db7929",
  "org.scalablytyped" %%% "pino-pretty" % "4.7-dt-20220624Z-4bafa0",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-fdfc4d",
  "org.scalablytyped" %%% "prom-client" % "14.1.0-7c4afd",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-76627f",
  "org.scalablytyped" %%% "re2" % "1.17.7-e9900d",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-696f82",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-fb4c83",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-d613cd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
