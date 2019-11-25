organization := "org.scalablytyped"
name := "swagger-restify-mw"
version := "0.7-dt-20181022Z-e8e7c0"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-95873a",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-bb266b",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-0c825b",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-6e26a9",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-21f8e2",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-a64687",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-102985",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20190322Z-03011e",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20191115Z-cd0ede",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-4d2224",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20191101Z-07b0c9",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-e84c0f",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-25897f",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-8cd1cd",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-382692",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-54468e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1b75dd",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20191119Z-3f7307",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-c3e43f",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-323181",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-ec5d5c",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-c25bdd",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20191107Z-e5d34b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        