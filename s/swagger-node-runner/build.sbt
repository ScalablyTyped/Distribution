organization := "org.scalablytyped"
name := "swagger-node-runner"
version := "0.5-dt-20181022Z-c16f70"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-e65c03",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-e33ccd",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-5e1bdd",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20181111Z-db91b1",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-38b4a6",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180603Z-05cc5e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-776b92",
  "org.scalablytyped" %%% "hapi" % "17.8-dt-20181212Z-0dfed3",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-b41add",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181211Z-2ffee8",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b650df",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-2b3832",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-78df08",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-b36599",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-ef877c",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20181121Z-663b58",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-f8f5d7",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-7e5092",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-8ff35c",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20181113Z-39f8b3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        