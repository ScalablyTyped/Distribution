organization := "org.scalablytyped"
name := "swagger-node-runner"
version := "0.6-dt-20190212Z-7cc1bf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-7dd9f0",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-5e1bbe",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-4adf62",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-901851",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-819901",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-db9911",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190524Z-6f5f9b",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-e106ba",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-c5d9a0",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-51779d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-49fefe",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-2bedcf",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-85fdc8",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-2c614a",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-97f9dc",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-374f35",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190528Z-4acbad",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-8d69c1",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-ef9f63",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-aaaca2",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190520Z-bdec76")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        