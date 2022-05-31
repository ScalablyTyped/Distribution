organization := "org.scalablytyped"
name := "swagger-node-runner"
version := "0.6-dt-20190212Z-18adc3"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-ad3420",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20200923Z-de0c0e",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20200515Z-4d424e",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20200515Z-34ada1",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-4e45b6",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-2d5437",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-44f8de",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20201002Z-7c7248",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20201028Z-a454ef",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20200515Z-7b1fa4",
  "org.scalablytyped" %%% "joi" % "17.3.0-94e9ff",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-162477",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-6f2a45",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20201002Z-cc5c40",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20201002Z-0745dc",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-64e6f9",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-329d84",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20201028Z-754ea4",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-bcf4d7",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20200515Z-6989a7",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20200227Z-051f5e",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20200515Z-88f86c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
