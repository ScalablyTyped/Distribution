organization := "org.scalablytyped"
name := "swagger-hapi"
version := "0.7-dt-20181022Z-6d6a0f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-7b4fa7",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20200923Z-843cda",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20200515Z-a0518a",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20200515Z-599c0f",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-931cf5",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-c593b9",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-c653a3",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20201002Z-2416a6",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20201028Z-e85ac7",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20200515Z-93859f",
  "org.scalablytyped" %%% "joi" % "17.3.0-423d65",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-5d04c6",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-a9d12a",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20201002Z-4fd9c5",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20201002Z-996143",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-dccf4c",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-1cff6e",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20201028Z-29650a",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-237e1c",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20200515Z-a3ee6d",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20200227Z-aefb04",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-4b622a",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20200515Z-6ddd08")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
