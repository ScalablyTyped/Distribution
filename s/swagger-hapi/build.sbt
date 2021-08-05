organization := "org.scalablytyped"
name := "swagger-hapi"
version := "0.7-dt-20181022Z-18eb72"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-1ee684",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20200923Z-8b7cf5",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20200515Z-13582c",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20200515Z-363b4a",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-a4b6e2",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-fb786d",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-4e2465",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20201002Z-dd8478",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20201028Z-774df9",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20200515Z-844f18",
  "org.scalablytyped" %%% "joi" % "17.3.0-38d96a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-418907",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-15dd66",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20201002Z-f3caf3",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20201002Z-3be8c9",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-805ca8",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-e007a0",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20201028Z-00a023",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-22aab1",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20200515Z-793c84",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20200227Z-496982",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-a9275f",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20200515Z-21fca6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
