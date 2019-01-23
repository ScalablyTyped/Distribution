organization := "org.scalablytyped"
name := "swagger-restify-mw"
version := "0.7-dt-20181022Z-a88e92"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-e9bff8",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-34ff31",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-782029",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190118Z-974f2c",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-014b69",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-fc1b93",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-eee1c1",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190119Z-85ed0a",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-80f03c",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190121Z-b10f91",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-2342ad",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-8d1804",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-e4ffa9",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-69aed2",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-a57469",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20181231Z-f49f45",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-f9c9b0",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-f822b0",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-7a03d6",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.5-dt-20181022Z-1174e1",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20181113Z-ab696d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        