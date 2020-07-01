organization := "org.scalablytyped"
name := "swagger-stats"
version := "0.95-dt-20200211Z-174c60"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-8ef17f",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200515Z-72dac4",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200515Z-d9cc4e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200624Z-cd1cc0",
  "org.scalablytyped" %%% "hapi__boom" % "9.1.0-c3c652",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-79f2ef",
  "org.scalablytyped" %%% "hapi__hapi" % "19.0-dt-20200515Z-873399",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-dc51ac",
  "org.scalablytyped" %%% "hapi__joi" % "17.1-dt-20200624Z-8e0ffe",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20200424Z-619e36",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20200515Z-220bcb",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-9b2d89",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200515Z-a16f63",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-5778e6",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "prom-client" % "11.5.3-636c5f",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200519Z-7b3798",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c5e2e8",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200519Z-9b0303",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
