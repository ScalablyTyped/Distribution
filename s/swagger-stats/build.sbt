organization := "org.scalablytyped"
name := "swagger-stats"
version := "0.95-dt-20200925Z-a3c9e6"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "6.12.6-8de37f",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-1ee684",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-a4b6e2",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-fb786d",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-4e2465",
  "org.scalablytyped" %%% "fastify" % "3.8.0-a68660",
  "org.scalablytyped" %%% "fastify-error" % "0.2.0-acf105",
  "org.scalablytyped" %%% "hapi__boom" % "9.1.0-0b46c9",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20200925Z-378f50",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20201028Z-99e1ca",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-11e972",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20200925Z-670aca",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20201002Z-15c189",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20200925Z-132e45",
  "org.scalablytyped" %%% "joi" % "17.3.0-38d96a",
  "org.scalablytyped" %%% "light-my-request" % "4.3.0-9482ea",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-418907",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-15dd66",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "prom-client" % "12.0.0-e757aa",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-805ca8",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-e007a0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-22aab1",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
