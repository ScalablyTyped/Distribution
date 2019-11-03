organization := "org.scalablytyped"
name := "swagger-hapi"
version := "0.7-dt-20181022Z-f901ef"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-e7066f",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-210d99",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-0da313",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-b970ae",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-76449c",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-35383f",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191101Z-ab49c4",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20191014Z-c3a6bc",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-cdcf6a",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20191101Z-c14a93",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-8e1e66",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-7db5f5",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-1cc445",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191101Z-508d7c",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-281e7e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c44ea2",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20191024Z-f8ccec",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-6b473e",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-2e844a",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-528de7",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-bc4370",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20191016Z-573f87")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        