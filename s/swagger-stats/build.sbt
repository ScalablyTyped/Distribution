organization := "org.scalablytyped"
name := "swagger-stats"
version := "0.95-dt-20220609Z-957257"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-20bcca",
  "org.scalablytyped" %%% "buffer" % "6.0.3-f5a9ba",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-cbb6c3",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-035d9a",
  "org.scalablytyped" %%% "fast-json-stringify" % "5.4.0-e699ba",
  "org.scalablytyped" %%% "fastify" % "4.9.2-71f242",
  "org.scalablytyped" %%% "fastify__ajv-compiler" % "3.3.1-8081e9",
  "org.scalablytyped" %%% "fastify__error" % "3.0.0-7d417f",
  "org.scalablytyped" %%% "fastify__fast-json-stringify-compiler" % "4.1.0-03df2b",
  "org.scalablytyped" %%% "find-my-way" % "7.3.1-c977a3",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.0-b5841b",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20211202Z-5bffc2",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20221019Z-5d36b2",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.0-0c7af4",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.0-c31a42",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.0-9153b7",
  "org.scalablytyped" %%% "joi" % "17.6.4-385a44",
  "org.scalablytyped" %%% "light-my-request" % "5.6.1-58b680",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "pino" % "8.7.0-4105aa",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-a79a24",
  "org.scalablytyped" %%% "prom-client" % "14.1.0-07d7e9",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "re2" % "1.17.7-5ddb3b",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-c7a026",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-0cfca7",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
