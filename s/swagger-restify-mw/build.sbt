organization := "org.scalablytyped"
name := "swagger-restify-mw"
version := "0.7-dt-20181022Z-e8a7a8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-0c0785",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-0d497d",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-1d3793",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-4efb44",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-729df7",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-648fa1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-383ca3",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190212Z-ccec0a",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-821ee3",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-455d3a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-f97a6c",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-5adee0",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190322Z-28a0c1",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-af8e6b",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5082d0",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190319Z-0784d4",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-9383be",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-009a97",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-8a94dd",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-a154b3",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190220Z-335ca8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        