organization := "org.scalablytyped"
name := "swagger-stats"
version := "0.95-dt-20220609Z-716d3f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-f4a508",
  "org.scalablytyped" %%% "buffer" % "6.0.3-6a53bb",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-eec5d4",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-693358",
  "org.scalablytyped" %%% "fast-json-stringify" % "5.4.0-66e9eb",
  "org.scalablytyped" %%% "fastify" % "4.9.2-4c3ad4",
  "org.scalablytyped" %%% "fastify__ajv-compiler" % "3.3.1-3b699d",
  "org.scalablytyped" %%% "fastify__error" % "3.0.0-f97171",
  "org.scalablytyped" %%% "fastify__fast-json-stringify-compiler" % "4.1.0-7d43aa",
  "org.scalablytyped" %%% "find-my-way" % "7.3.1-fff760",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.0-7be43c",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20211202Z-830847",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20221019Z-aa7c94",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.0-571c40",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.0-b3ec1d",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.0-de58ae",
  "org.scalablytyped" %%% "joi" % "17.6.4-bd3b75",
  "org.scalablytyped" %%% "light-my-request" % "5.6.1-7263e6",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-9884c6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "pino" % "8.7.0-bde1fd",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-5cf6b2",
  "org.scalablytyped" %%% "prom-client" % "14.1.0-7c4afd",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-76627f",
  "org.scalablytyped" %%% "re2" % "1.17.7-9752ba",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-91f487",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-b805f8",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-d613cd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
