organization := "org.scalablytyped"
name := "swagger-hapi"
version := "0.7-dt-20181022Z-fdefff"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-aabbef",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-a9c90d",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-c17bdb",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-31857d",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-db6ee1",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-3b7640",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-dff786",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-95eb3d",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-13e7ff",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-22a7d7",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-51ab0c",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-076342",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-c1978b",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-8637fd",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-6c0f60",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-0d10b5",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20190826Z-02ec33",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-e134e0",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-3b5025",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-c056ef",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-4774d1",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190701Z-9b9913")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        