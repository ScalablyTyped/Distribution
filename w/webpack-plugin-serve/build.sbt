organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "1.4-dt-20211223Z-7e2cc4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20211202Z-6edf5c",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-d67c0f",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20211202Z-065bfc",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20220505Z-baf750",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20211202Z-a7929e",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-944d8b",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-0c6b73",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20220503Z-823d49",
  "org.scalablytyped" %%% "http-proxy-middleware" % "2.0.6-6051d1",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20211202Z-ff8589",
  "org.scalablytyped" %%% "koa" % "2.13.1-dt-20220818Z-a193a1",
  "org.scalablytyped" %%% "koa-compress" % "v4.x-dt-20220818Z-1b1f56",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20211202Z-8d6312",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20211202Z-3be9c9",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-3b575f",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
