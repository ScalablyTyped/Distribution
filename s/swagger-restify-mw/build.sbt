organization := "org.scalablytyped"
name := "swagger-restify-mw"
version := "0.7-dt-20181022Z-264b71"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-ea079a",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-aa101c",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-04ae87",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-6b2b90",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-224a28",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-2df7b1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191220Z-488272",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20190322Z-bf60b7",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20191115Z-0d81b6",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-08b96e",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20191101Z-71d4bf",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-e32d86",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-55b31a",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-3bdf23",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-0dcaae",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-166e61",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20191119Z-faae88",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-ba7911",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-967701",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-7af850",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-423c97",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20191107Z-23c1fe")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        