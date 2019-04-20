organization := "org.scalablytyped"
name := "swagger-express-mw"
version := "0.7-dt-20181022Z-b56640"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-0aa3ae",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-937b6e",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-59abb5",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-2a99dd",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-17767a",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-f9a52b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-a993f8",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190416Z-1443c9",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-9eca1e",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-daf975",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-b7b3da",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-e0e89b",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-329130",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190419Z-3f0246",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-09fe84",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c3b9c7",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190319Z-fcc682",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-bad4a0",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-293109",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-35d4ba",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-013e72",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190220Z-3e1bf7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        