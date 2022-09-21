organization := "org.scalablytyped"
name := "swagger-stats"
version := "0.95-dt-20220609Z-c2fc34"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-025d79",
  "org.scalablytyped" %%% "buffer" % "6.0.3-1325ca",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-6f01fe",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-c34bb1",
  "org.scalablytyped" %%% "fast-json-stringify" % "5.3.0-87050c",
  "org.scalablytyped" %%% "fastify" % "4.6.0-26cd4e",
  "org.scalablytyped" %%% "fastify__ajv-compiler" % "3.3.1-bb7d4c",
  "org.scalablytyped" %%% "fastify__error" % "3.0.0-5c359b",
  "org.scalablytyped" %%% "fastify__fast-json-stringify-compiler" % "4.1.0-76c229",
  "org.scalablytyped" %%% "find-my-way" % "7.2.0-c4186c",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.0-dca375",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20211202Z-4218e0",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20220525Z-0d28aa",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.0-92431e",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.0-eddb9d",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.0-8d41cf",
  "org.scalablytyped" %%% "joi" % "17.6.0-f7916a",
  "org.scalablytyped" %%% "light-my-request" % "5.6.1-2702a0",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-21c0d6",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "pino" % "8.6.0-b63ec5",
  "org.scalablytyped" %%% "pino-pretty" % "4.7-dt-20220624Z-ed7d9a",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-d522a5",
  "org.scalablytyped" %%% "prom-client" % "14.1.0-081888",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-11838a",
  "org.scalablytyped" %%% "re2" % "1.17.7-22ea4f",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-77d826",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-620a90",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-33748e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
