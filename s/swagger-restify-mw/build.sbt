organization := "org.scalablytyped"
name := "swagger-restify-mw"
version := "0.7-dt-20181022Z-d33d32"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-c42858",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-efa725",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-e09edc",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-f30551",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-058a79",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-641541",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200121Z-e6811a",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20190322Z-2c4b5d",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20200128Z-8a03ea",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-7e0c86",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20191101Z-0b3433",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-3b5426",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-574028",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-327e15",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-4a23e4",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ae0c0",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20191119Z-cb2c91",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-28020e",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-ad5671",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-2cd8ae",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-5c0321",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20191107Z-3b3ecd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
