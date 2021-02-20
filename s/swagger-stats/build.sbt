organization := "org.scalablytyped"
name := "swagger-stats"
version := "0.95-dt-20200925Z-7537ac"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "ajv" % "6.12.6-44caf4",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-210a9e",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-9b0b3f",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-2a8190",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-49f0c4",
  "org.scalablytyped" %%% "fastify" % "3.8.0-5c81ea",
  "org.scalablytyped" %%% "fastify-error" % "0.2.0-fcd567",
  "org.scalablytyped" %%% "hapi__boom" % "9.1.0-015fca",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20200925Z-9f5e62",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20201028Z-ed7e72",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-bda26a",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20200925Z-292bbe",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20201002Z-2b3679",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20200925Z-75f810",
  "org.scalablytyped" %%% "joi" % "17.3.0-7ba32d",
  "org.scalablytyped" %%% "light-my-request" % "4.3.0-daaec0",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-901708",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-64e776",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "prom-client" % "12.0.0-1d26ad",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-f71cda",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-cf0dc0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-7640b4",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
