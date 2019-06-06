organization := "org.scalablytyped"
name := "swagger-express-mw"
version := "0.7-dt-20181022Z-0142c2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-cc8509",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-5e1bbe",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-599cd8",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-901851",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-a0bc27",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-d1c3bf",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190524Z-712af1",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-c1a516",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-a0d901",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-51779d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-49fefe",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-2bedcf",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-85fdc8",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190605Z-895d8c",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-97f9dc",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-374f35",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190528Z-2698eb",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-ed9c04",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-3b357a",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-c1b869",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-eca676",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190520Z-bdec76")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        