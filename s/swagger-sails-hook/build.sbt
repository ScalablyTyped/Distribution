organization := "com.scalablytyped"
name := "swagger-sails-hook"
version := "0.7-dt-20181102Z-6d692a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "body-parser" % "1.17-dt-20181102Z-5991c4",
  "com.scalablytyped" %%% "boom" % "7.2-dt-20181102Z-4b4a12",
  "com.scalablytyped" %%% "bunyan" % "1.8-dt-20181102Z-d016a4",
  "com.scalablytyped" %%% "catbox" % "10.0-dt-20181102Z-07b79d",
  "com.scalablytyped" %%% "connect" % "v3.4.0-dt-20181102Z-210269",
  "com.scalablytyped" %%% "express" % "4.16-dt-20181102Z-d3111c",
  "com.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20181102Z-8da2fa",
  "com.scalablytyped" %%% "hapi" % "17.6-dt-20181109Z-5d57f9",
  "com.scalablytyped" %%% "iron" % "5.0-dt-20181102Z-0965b4",
  "com.scalablytyped" %%% "joi" % "14.0-dt-20181102Z-09d993",
  "com.scalablytyped" %%% "mime" % "2.0-dt-20181102Z-16ee55",
  "com.scalablytyped" %%% "mime-db" % "1.27-dt-20181102Z-a1d6bd",
  "com.scalablytyped" %%% "mimos" % "3.0-dt-20181102Z-b2518b",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "podium" % "1.0-dt-20181102Z-6a3b2c",
  "com.scalablytyped" %%% "range-parser" % "1.2-dt-20181102Z-399813",
  "com.scalablytyped" %%% "restify" % "7.2-dt-20181102Z-3bf775",
  "com.scalablytyped" %%% "serve-static" % "1.13-dt-20181102Z-c1072c",
  "com.scalablytyped" %%% "shot" % "4.0-dt-20181102Z-8203d5",
  "com.scalablytyped" %%% "spdy" % "3.4-dt-20181102Z-12dafe",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "swagger-node-runner" % "0.5-dt-20181102Z-e0b694",
  "com.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20181116Z-421cfe",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        