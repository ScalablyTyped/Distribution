organization := "org.scalablytyped"
name := "swagger-express-mw"
version := "0.7-dt-20181022Z-704888"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-d89a50",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-31ac2c",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-434fbb",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-07848f",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-ee50f3",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-083460",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190717Z-df4cf9",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-dd8adb",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-f2a562",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-8ac771",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-85a68c",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-cb7ee4",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-ce07fc",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190717Z-f93e3e",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-a07bf8",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-223eff",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190716Z-f616e7",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-00865d",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-c5817e",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-5a346b",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-d64d13",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190701Z-66f302")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        