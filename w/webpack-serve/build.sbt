organization := "org.scalablytyped"
name := "webpack-serve"
version := "2.0-dt-20200226Z-04be19"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20200515Z-97a3df",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-210a9e",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-9b0b3f",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20200515Z-9d7c92",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20201028Z-321a92",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-2a8190",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-49f0c4",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20200515Z-77de6b",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20201020Z-c1b451",
  "org.scalablytyped" %%% "loglevel" % "1.7.0-f01734",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20201002Z-08b669",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-901708",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-f71cda",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-cf0dc0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-7640b4",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "3.7-dt-20200818Z-73d3d6",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.1-dt-20200225Z-6a14c9",
  "org.scalablytyped" %%% "ws" % "7.4-dt-20201109Z-9df179")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
