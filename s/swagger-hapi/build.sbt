organization := "org.scalablytyped"
name := "swagger-hapi"
version := "0.7-dt-20181022Z-b2c895"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-f1cf1e",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-aa101c",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-85a236",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-6b2b90",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-0a9c38",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-b0737f",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191220Z-941e8c",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20190322Z-fc6429",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20191115Z-bdb717",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-0b3b0a",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20191101Z-71d4bf",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-e32d86",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-55b31a",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-3bdf23",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-0dcaae",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-166e61",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20191119Z-6040f0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-949d85",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-b28883",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-e9bec4",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-0d1d7e",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20191107Z-23c1fe")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        