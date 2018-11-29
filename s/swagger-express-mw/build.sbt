organization := "com.scalablytyped"
name := "swagger-express-mw"
version := "0.7-dt-20181027Z-76d711"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-bbb8a6",
  "com.scalablytyped" %%% "boom" % "7.2-dt-20181120Z-500330",
  "com.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-e292a0",
  "com.scalablytyped" %%% "catbox" % "10.0-dt-20181121Z-981978",
  "com.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-c1f383",
  "com.scalablytyped" %%% "express" % "4.16-dt-20180910Z-1b16d7",
  "com.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-bec6af",
  "com.scalablytyped" %%% "hapi" % "17.8-dt-20181129Z-db5334",
  "com.scalablytyped" %%% "iron" % "5.0-dt-20180910Z-4d9ee8",
  "com.scalablytyped" %%% "joi" % "14.0-dt-20181031Z-cbdcd6",
  "com.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-c023cc",
  "com.scalablytyped" %%% "mime-db" % "1.27-dt-20180910Z-fdb4ff",
  "com.scalablytyped" %%% "mimos" % "3.0-dt-20180910Z-d42ee9",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "podium" % "1.0-dt-20180910Z-458a88",
  "com.scalablytyped" %%% "range-parser" % "1.2-dt-20180910Z-1bf893",
  "com.scalablytyped" %%% "restify" % "7.2-dt-20181121Z-03549b",
  "com.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-953de2",
  "com.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-90a3c7",
  "com.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-16a77c",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "swagger-node-runner" % "0.5-dt-20181027Z-8bd1d7",
  "com.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20181121Z-54b5e0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        