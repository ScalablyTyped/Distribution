organization := "org.scalablytyped"
name := "swagger-node-runner"
version := "0.6-dt-20190212Z-acc7e1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-041fae",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-62c842",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-0ed5d5",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-b66195",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-0256e3",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-2f223f",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-5ccdcb",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-b1b215",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-c9663f",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-332cbb",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-1c84be",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-a40537",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-c70aeb",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190708Z-e1e986",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-2f0000",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-f16918",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190528Z-342b41",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-496baf",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-edf05d",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-bac14e",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190701Z-18f2e0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        