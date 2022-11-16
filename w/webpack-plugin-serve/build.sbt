organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "1.4-dt-20211223Z-49af39"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20211202Z-3fcf45",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-fdb527",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20211202Z-1d8bf3",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20220505Z-0b924b",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20211202Z-bf413b",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-2966c9",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-5cc384",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20220503Z-6aa320",
  "org.scalablytyped" %%% "http-proxy-middleware" % "2.0.6-680883",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20211202Z-a3843d",
  "org.scalablytyped" %%% "koa" % "2.13.1-dt-20220818Z-f9052f",
  "org.scalablytyped" %%% "koa-compress" % "v4.x-dt-20220818Z-06a456",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20211202Z-0ff9ec",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20211202Z-23b363",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-4d0efa",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-fa36ba",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-088887",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
