organization := "org.scalablytyped"
name := "swagger-hapi"
version := "0.7-dt-20181022Z-3b1e35"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-cbd349",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-344433",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-7b23ed",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190126Z-804551",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-fc559d",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-593054",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-12a485",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190119Z-9bac62",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-3e3749",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190131Z-6a437a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-b2cae6",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-086af5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-9f73ab",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-7174cc",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c7c39d",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20181231Z-3f459a",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-ed7327",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-e04c16",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-cc33f7",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.5-dt-20181022Z-8721ff",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20181113Z-d43a59")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        