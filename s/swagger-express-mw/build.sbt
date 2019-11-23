organization := "org.scalablytyped"
name := "swagger-express-mw"
version := "0.7-dt-20181022Z-3486b2"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-b36108",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-5c1264",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-f2b467",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-5479a7",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-a0f3dc",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-24df32",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-4dd221",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20190322Z-640cb2",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20191115Z-47275a",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-cd99b8",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20191101Z-6c76f1",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-301fe0",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-c223ab",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-7afbb3",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-304e79",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-ae0e0c",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ebcbf",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20191119Z-2885c2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-37db83",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-345f2d",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-a2bda5",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-def791",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20191107Z-057cb3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        