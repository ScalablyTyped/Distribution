organization := "org.scalablytyped"
name := "swagger-stats"
version := "0.95-dt-20200925Z-38be43"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.12.6-6699f6",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-7b4fa7",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-931cf5",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-c593b9",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-c653a3",
  "org.scalablytyped" %%% "fastify" % "3.8.0-6d7776",
  "org.scalablytyped" %%% "fastify-error" % "0.2.0-dee7e5",
  "org.scalablytyped" %%% "hapi__boom" % "9.1.0-ea1163",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20200925Z-5f8826",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20201028Z-828280",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-ca2847",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20200925Z-b18c8d",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20201002Z-b05588",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20200925Z-d1ef9a",
  "org.scalablytyped" %%% "joi" % "17.3.0-423d65",
  "org.scalablytyped" %%% "light-my-request" % "4.3.0-1e538a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-5d04c6",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-a9d12a",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "prom-client" % "12.0.0-75e176",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-dccf4c",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-1cff6e",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-237e1c",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
