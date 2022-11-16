organization := "org.scalablytyped"
name := "swagger-express-mw"
version := "0.7-dt-20211202Z-567368"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20221103Z-4a7295",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-730932",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20211202Z-78a4d5",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-2966c9",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-5cc384",
  "org.scalablytyped" %%% "formidable" % "2.0-dt-20220502Z-ad9c7a",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20221103Z-aaf14f",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20211202Z-dda049",
  "org.scalablytyped" %%% "joi" % "17.7.0-985b45",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-4d0efa",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20211202Z-a6e630",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20211202Z-5535da",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20211202Z-75d06f",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-fa36ba",
  "org.scalablytyped" %%% "restify" % "8.5-dt-20220810Z-5b2389",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-088887",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20211202Z-02aaa4",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20211202Z-f5926e",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20211202Z-32880b",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20211202Z-243cfe")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
