organization := "org.scalablytyped"
name := "swagger-express-mw"
version := "0.7-dt-20181022Z-d17f0b"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-0f462b",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-abd1a2",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-b837fa",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-2cac09",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-8e708a",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190816Z-515e7b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190816Z-71409c",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-8fcc81",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-0b3c35",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-57592b",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-c877f7",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-05dd4d",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-39cfe3",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-2dc4df",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-9ec145",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-b87c0a",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190716Z-cb5202",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-55674a",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-8be969",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-e2674a",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-a38d47",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190701Z-df4263")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        