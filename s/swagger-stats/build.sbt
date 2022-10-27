organization := "org.scalablytyped"
name := "swagger-stats"
version := "0.95-dt-20220609Z-5cf6e3"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-fcbdcb",
  "org.scalablytyped" %%% "buffer" % "6.0.3-f5a9ba",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-7a82fe",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-87e3cc",
  "org.scalablytyped" %%% "fast-json-stringify" % "5.4.0-ad23da",
  "org.scalablytyped" %%% "fastify" % "4.9.2-45777f",
  "org.scalablytyped" %%% "fastify__ajv-compiler" % "3.3.1-6f920d",
  "org.scalablytyped" %%% "fastify__error" % "3.0.0-7d417f",
  "org.scalablytyped" %%% "fastify__fast-json-stringify-compiler" % "4.1.0-af7d11",
  "org.scalablytyped" %%% "find-my-way" % "7.3.1-84a718",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.0-b5841b",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20211202Z-5bffc2",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20221019Z-cb7b35",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.0-818f68",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.0-c31a42",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.0-78e4ec",
  "org.scalablytyped" %%% "joi" % "17.6.4-77dbda",
  "org.scalablytyped" %%% "light-my-request" % "5.6.1-7d51c6",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "pino" % "8.7.0-1e72c0",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-e4959c",
  "org.scalablytyped" %%% "prom-client" % "14.1.0-07d7e9",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "re2" % "1.17.7-18b669",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-5e7139",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-d1def4",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
