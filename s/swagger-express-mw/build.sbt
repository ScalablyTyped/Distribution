organization := "org.scalablytyped"
name := "swagger-express-mw"
version := "0.7-dt-20181022Z-133ddb"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-cc0ef5",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-507232",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-7d7d13",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-149aab",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-07dbf2",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-f4e6a1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200121Z-868c54",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20190322Z-2adee2",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20200128Z-efcdd7",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-6a337c",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20191101Z-a05836",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-4fb0bc",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-963524",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-6ff1d4",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-061b8a",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-7c1dac",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20191119Z-1b7e80",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-d83efd",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-1b11d2",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-7137d4",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-2edf45",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20191107Z-35c061")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
