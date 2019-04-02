organization := "org.scalablytyped"
name := "swagger-sails-hook"
version := "0.7-dt-20181022Z-89fcd7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-249d28",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-bd3199",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-a86bd4",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-6773cd",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-53c35c",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-33b861",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-c31b2e",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190212Z-9f27f4",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-f14200",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-86a92a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-2631f3",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-ea22a6",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-dedbe7",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-e48ffc",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-623d43",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190319Z-236bc6",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-201a01",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-7f8f87",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-c06aa7",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-9d7972",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190220Z-890a05")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        