organization := "org.scalablytyped"
name := "swagger-restify-mw"
version := "0.7-dt-20181022Z-da7a70"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-b38537",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-34ff31",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-66c89e",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190126Z-033a91",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-c7658c",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-02bf23",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-7910af",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190119Z-9b3604",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-12fc3e",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190121Z-b10f91",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-2342ad",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-8d1804",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-e4ffa9",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-40209e",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-69aed2",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-a57469",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20181231Z-608e0f",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-195cb6",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-e0cc69",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-640832",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.5-dt-20181022Z-ddaf66",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20181113Z-ab696d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        