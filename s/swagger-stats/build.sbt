organization := "org.scalablytyped"
name := "swagger-stats"
version := "0.95-dt-20200211Z-9c3faf"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-5329e6",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200515Z-4db3c4",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200515Z-9eb2b7",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200515Z-c2bfc2",
  "org.scalablytyped" %%% "hapi__boom" % "9.1.0-e07782",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-679aad",
  "org.scalablytyped" %%% "hapi__hapi" % "19.0-dt-20200515Z-2e543b",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-e62043",
  "org.scalablytyped" %%% "hapi__joi" % "17.1-dt-20200505Z-5c6806",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20200424Z-dfa6ce",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20200515Z-4b0358",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-6aa194",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200515Z-593c89",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-ce2530",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "prom-client" % "11.5.3-097c52",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200519Z-7ad812",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-cd197c",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200519Z-9da187",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
