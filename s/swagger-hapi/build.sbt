organization := "org.scalablytyped"
name := "swagger-hapi"
version := "0.7-dt-20211202Z-5a05df"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20221103Z-118a62",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-fff3da",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20211202Z-7cf14c",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-118d16",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-e830b8",
  "org.scalablytyped" %%% "formidable" % "2.0-dt-20220502Z-562f67",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20221103Z-183fcc",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20211202Z-a0c0e9",
  "org.scalablytyped" %%% "joi" % "17.7.0-c612b4",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-381f52",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20211202Z-73e469",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20211202Z-910a44",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20211202Z-5143c4",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-625bd0",
  "org.scalablytyped" %%% "restify" % "8.5-dt-20220810Z-00dd78",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-5be9af",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20211202Z-b1af3c",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20211202Z-587716",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20211202Z-039a4b",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20211202Z-5bab6a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
