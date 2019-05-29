organization := "org.scalablytyped"
name := "swagger-restify-mw"
version := "0.7-dt-20181022Z-095ab1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-bfc0a3",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-7552d8",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-f2608e",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-ebb549",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-468aa7",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-c27d44",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190524Z-c3ce7d",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-28bbb1",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-13841a",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-950001",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-6731ec",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-aa326f",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-9597ab",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-d31d51",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-3e1146",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190528Z-8f64aa",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-d55a89",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-e684be",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-fc6041",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-4dd445",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190520Z-7dc0f7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        