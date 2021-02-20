organization := "org.scalablytyped"
name := "swagger-express-mw"
version := "0.7-dt-20181022Z-0bbab5"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-210a9e",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20200923Z-a95606",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20200515Z-642e90",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20200515Z-f1405e",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-9b0b3f",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-2a8190",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-49f0c4",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20201002Z-cd44e9",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20201028Z-a9a88e",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20200515Z-36d70f",
  "org.scalablytyped" %%% "joi" % "17.3.0-7ba32d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-901708",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-64e776",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20201002Z-463d11",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20201002Z-d8189f",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-f71cda",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-cf0dc0",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20201028Z-45069e",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-7640b4",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20200515Z-15bc78",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20200227Z-ad4b4f",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-703fc7",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20200515Z-024653")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
