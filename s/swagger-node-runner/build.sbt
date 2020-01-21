organization := "org.scalablytyped"
name := "swagger-node-runner"
version := "0.6-dt-20190212Z-4f642d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-1b4f69",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-f209a1",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-e603a8",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-bc2b37",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-b60015",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-56f2e3",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191220Z-8b81e3",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20190322Z-eda139",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20191115Z-65a503",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-b06693",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20191101Z-fa0830",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-03061a",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-cef82e",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-f2b7ca",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-469ff5",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-b58a9e",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20191119Z-e3d8f6",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-314389",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-05de5c",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-563b09",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20191107Z-68e46a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        