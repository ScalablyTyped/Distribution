organization := "org.scalablytyped"
name := "swagger-node-runner"
version := "0.5-dt-20181022Z-6829d8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-82bef3",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-344433",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-d42d69",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190126Z-804551",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-e6a834",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-714bd6",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-4af3eb",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190119Z-cd6aae",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-b05f55",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190131Z-6a437a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-b2cae6",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-086af5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-3468e4",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-7174cc",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c7c39d",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20181231Z-3f2e0c",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-6911a2",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-4237fd",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-a34207",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20181113Z-d43a59")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        