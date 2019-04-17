organization := "org.scalablytyped"
name := "swagger-restify-mw"
version := "0.7-dt-20181022Z-96c7c4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-58078f",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-937b6e",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-bba342",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-2a99dd",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-b54bcb",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-647453",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-7a04b0",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190416Z-2ec479",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-64a34b",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-daf975",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-b7b3da",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-e0e89b",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-329130",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-28d4e0",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-09fe84",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c3b9c7",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190319Z-3d76f0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-4dbd53",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-affd4a",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-baf69c",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-cb2c59",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190220Z-3e1bf7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        