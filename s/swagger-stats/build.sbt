organization := "org.scalablytyped"
name := "swagger-stats"
version := "0.95-dt-20200925Z-59caad"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "6.12.6-3e2017",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-ad3420",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-4e45b6",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-2d5437",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-44f8de",
  "org.scalablytyped" %%% "fastify" % "3.8.0-6abbff",
  "org.scalablytyped" %%% "fastify-error" % "0.2.0-b9f013",
  "org.scalablytyped" %%% "hapi__boom" % "9.1.0-82dfc1",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20200925Z-007b0b",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20201028Z-d2010b",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-2e431d",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20200925Z-548048",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20201002Z-dc1b10",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20200925Z-ef1bdd",
  "org.scalablytyped" %%% "joi" % "17.3.0-94e9ff",
  "org.scalablytyped" %%% "light-my-request" % "4.3.0-eda016",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-162477",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-6f2a45",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "prom-client" % "12.0.0-55c4a9",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-64e6f9",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-329d84",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-bcf4d7",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
