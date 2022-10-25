organization := "org.scalablytyped"
name := "swagger-express-mw"
version := "0.7-dt-20211202Z-f0e0c9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20220913Z-f2e8e0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-5f30f8",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20211202Z-24c331",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-cbb6c3",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-035d9a",
  "org.scalablytyped" %%% "formidable" % "2.0-dt-20220502Z-7c803d",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20220819Z-71f69f",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20211202Z-c4dd8f",
  "org.scalablytyped" %%% "joi" % "17.6.4-385a44",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20211202Z-0ac956",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20211202Z-aefc2e",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20211202Z-62aa88",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "restify" % "8.5-dt-20220810Z-62d53b",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-c7a026",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20211202Z-32480e",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20211202Z-e213f4",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20211202Z-121daa",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20211202Z-feb459")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
