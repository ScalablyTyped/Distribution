organization := "org.scalablytyped"
name := "swagger-node-runner"
version := "0.6-dt-20211202Z-8090f9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20221103Z-3f8625",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-c4ac72",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20211202Z-5c2246",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-cb1e35",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-5f1c10",
  "org.scalablytyped" %%% "formidable" % "2.0-dt-20220502Z-88c3d9",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20221103Z-38afd1",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20211202Z-5d016e",
  "org.scalablytyped" %%% "joi" % "17.7.0-7c28f2",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-85c9dc",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20211202Z-064059",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20211202Z-796661",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20211202Z-32f50b",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-137229",
  "org.scalablytyped" %%% "restify" % "8.5-dt-20220810Z-3a74ac",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-d3379f",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20211202Z-342deb",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20211202Z-ec349c",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20211202Z-2b5ed4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
