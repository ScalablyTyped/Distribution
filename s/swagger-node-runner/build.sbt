organization := "org.scalablytyped"
name := "swagger-node-runner"
version := "0.5-dt-20181022Z-1fdca0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-34f287",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-34ff31",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-3f2bcc",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190118Z-974f2c",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-202759",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-0c8b00",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-cd70e8",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190119Z-db542a",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-4ef611",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190121Z-b10f91",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-2342ad",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-8d1804",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-e4ffa9",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-69aed2",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-a57469",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20181231Z-e5c526",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-22f3a9",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-5ea804",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-9cefbf",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20181113Z-ab696d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        