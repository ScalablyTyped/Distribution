organization := "org.scalablytyped"
name := "swagger-node-runner"
version := "0.6-dt-20190212Z-3d4f0b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-5c00d3",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-bb266b",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-a9a851",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-6e26a9",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-3ec72b",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-10cbdd",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-49513f",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20190322Z-ec0a27",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20191115Z-3c36e5",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-bfc2af",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20191101Z-07b0c9",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-e84c0f",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-25897f",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-8cd1cd",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-54468e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1b75dd",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20191119Z-1659be",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-1f57e0",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-06a008",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-819067",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20191107Z-41f249")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        