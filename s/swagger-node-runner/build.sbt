organization := "org.scalablytyped"
name := "swagger-node-runner"
version := "0.6-dt-20211202Z-48fdd9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20220913Z-f2e8e0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-7a320b",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20211202Z-24c331",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-a77eec",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-80f63d",
  "org.scalablytyped" %%% "formidable" % "2.0-dt-20220502Z-69361b",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20220819Z-3bde14",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20211202Z-d5b634",
  "org.scalablytyped" %%% "joi" % "17.6.4-33cc25",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20211202Z-0ac956",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20211202Z-aefc2e",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20211202Z-62aa88",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "restify" % "8.5-dt-20220810Z-e558df",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-5b9e43",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20211202Z-d6788f",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20211202Z-7439a8",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20211202Z-feb459")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
