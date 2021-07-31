organization := "org.scalablytyped"
name := "swagger-stats"
version := "0.95-dt-20200925Z-2819bf"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "6.12.6-9ca4f0",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-0ef592",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-4b695b",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-2f63a9",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-2cc92e",
  "org.scalablytyped" %%% "fastify" % "3.8.0-b9c5fb",
  "org.scalablytyped" %%% "fastify-error" % "0.2.0-9cda31",
  "org.scalablytyped" %%% "hapi__boom" % "9.1.0-ffcf70",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20200925Z-db0802",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20201028Z-bb1592",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-16f1e5",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20200925Z-9ba692",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20201002Z-957ac9",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20200925Z-2e2406",
  "org.scalablytyped" %%% "joi" % "17.3.0-91f698",
  "org.scalablytyped" %%% "light-my-request" % "4.3.0-a45283",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-35349b",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-3ec634",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "prom-client" % "12.0.0-c42d4c",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-42be7a",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-f5b664",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-f95694",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
