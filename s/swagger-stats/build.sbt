organization := "org.scalablytyped"
name := "swagger-stats"
version := "0.95-dt-20200211Z-296031"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-e204eb",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200226Z-677666",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200409Z-704088",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200415Z-afdfd2",
  "org.scalablytyped" %%% "hapi__boom" % "9.1.0-35a491",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-dc90bc",
  "org.scalablytyped" %%% "hapi__hapi" % "19.0-dt-20200227Z-03184e",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-1ece61",
  "org.scalablytyped" %%% "hapi__joi" % "16.0-dt-20200225Z-b5a4a3",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20200330Z-2a1a5f",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20200225Z-e13790",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-c6dac4",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-cd6086",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20200330Z-8b3e50",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "prom-client" % "11.5.3-12cd2b",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200225Z-6c439e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-0a8d6e",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200227Z-c88828",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
