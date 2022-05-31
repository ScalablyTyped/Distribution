organization := "org.scalablytyped"
name := "webpack-serve"
version := "2.0-dt-20200226Z-a316dc"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20200515Z-0d457c",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-ad3420",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-4e45b6",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20200515Z-434816",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20201028Z-d899e7",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-2d5437",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-44f8de",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20200515Z-5835a3",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20201020Z-b7b66f",
  "org.scalablytyped" %%% "loglevel" % "1.7.0-18e3de",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20201002Z-14f1c9",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-162477",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-64e6f9",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-329d84",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-bcf4d7",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "3.7-dt-20200818Z-b83d44",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.1-dt-20200225Z-b10c68",
  "org.scalablytyped" %%% "ws" % "7.4-dt-20201109Z-9be819")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
