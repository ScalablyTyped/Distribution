organization := "org.scalablytyped"
name := "swagger-restify-mw"
version := "0.7-dt-20181022Z-bfc124"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-0ef592",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20200923Z-9ffb4e",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20200515Z-af8262",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20200515Z-cb8cb5",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-4b695b",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-2f63a9",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-2cc92e",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20201002Z-2e884c",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20201028Z-6783f5",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20200515Z-1344e9",
  "org.scalablytyped" %%% "joi" % "17.3.0-91f698",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-35349b",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-3ec634",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20201002Z-550963",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20201002Z-dfec96",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-42be7a",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-f5b664",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20201028Z-10c7db",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-f95694",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20200515Z-4387e0",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20200227Z-5de895",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-ed5e48",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20200515Z-808910")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
