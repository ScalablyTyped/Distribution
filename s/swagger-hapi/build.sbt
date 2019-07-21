organization := "org.scalablytyped"
name := "swagger-hapi"
version := "0.7-dt-20181022Z-48c302"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-9c543c",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-62c842",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-7b67b4",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-b66195",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-e1c7d7",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-e6cc14",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190717Z-2e57f1",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-dfb962",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-c594ad",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-332cbb",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-1c84be",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-a40537",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-c70aeb",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190717Z-e46800",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-2f0000",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-f16918",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190716Z-ee6c72",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-43ad97",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-c98315",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-c055da",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-98aa95",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190701Z-18f2e0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        