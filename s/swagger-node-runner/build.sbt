organization := "org.scalablytyped"
name := "swagger-node-runner"
version := "0.6-dt-20190212Z-80e335"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-40b8d3",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-344433",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-dd7f46",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-804551",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-50c57a",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-42d72c",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-ab47ea",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190212Z-12b835",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-608e2a",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-f16652",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-b2cae6",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-086af5",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-604ea6",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-7174cc",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c7c39d",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190212Z-c94da1",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-fa6869",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-0b7fe0",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-28c4a9",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190220Z-508b34")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        