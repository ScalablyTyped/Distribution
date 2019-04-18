organization := "org.scalablytyped"
name := "swagger-node-runner"
version := "0.6-dt-20190212Z-d343af"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-eda7b1",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-937b6e",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-b2ddd8",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-2a99dd",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-28d2d3",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-c7cba5",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-10584a",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190416Z-bf985c",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-b039f3",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-daf975",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-b7b3da",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-e0e89b",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-329130",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190417Z-002402",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-09fe84",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c3b9c7",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190319Z-f55bbc",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-82bdb8",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-2aa23d",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-fa3a17",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190220Z-3e1bf7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        