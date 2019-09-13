organization := "org.scalablytyped"
name := "swagger-restify-mw"
version := "0.7-dt-20181022Z-4bd972"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-8ff114",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-a8883d",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-b32e12",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-9bb8d3",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-090bd5",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-915bef",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-48acfb",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-968bbe",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-3da7e8",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-aeaeee",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-612693",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-2b791f",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-fef82d",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190911Z-da4655",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-77c72d",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-db4fa8",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20190826Z-b9bf84",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-4181d6",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-018fb5",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-69e123",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-b82096",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190701Z-ad1ffe")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        