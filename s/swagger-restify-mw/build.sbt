organization := "org.scalablytyped"
name := "swagger-restify-mw"
version := "0.7-dt-20181022Z-6224d0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-f89d38",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-8f05d7",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-105a17",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-24870c",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-07b727",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-47e6a1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-ae49a5",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-5356a1",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-907d86",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-8de623",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-51fe5c",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-96bb6c",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-c8b449",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-55c3e6",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-39a594",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190528Z-925fcb",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-c829e9",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-df6178",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-30f96b",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-95e895",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190613Z-4bf8c2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        