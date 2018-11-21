organization := "com.scalablytyped"
name := "swagger-hapi"
version := "0.7-dt-20181027Z-012a70"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-6ca2c5",
  "com.scalablytyped" %%% "boom" % "7.2-dt-20181120Z-57c4d8",
  "com.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-446dff",
  "com.scalablytyped" %%% "catbox" % "10.0-dt-20181027Z-c5a6cc",
  "com.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-feceb2",
  "com.scalablytyped" %%% "express" % "4.16-dt-20180910Z-4d8764",
  "com.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-43b19a",
  "com.scalablytyped" %%% "hapi" % "17.6-dt-20181120Z-c8bf70",
  "com.scalablytyped" %%% "iron" % "5.0-dt-20180910Z-b7e3c1",
  "com.scalablytyped" %%% "joi" % "14.0-dt-20181031Z-8cc4e5",
  "com.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-f9ab87",
  "com.scalablytyped" %%% "mime-db" % "1.27-dt-20180910Z-34fa5b",
  "com.scalablytyped" %%% "mimos" % "3.0-dt-20180910Z-e347b3",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-cadd20",
  "com.scalablytyped" %%% "podium" % "1.0-dt-20180910Z-db7ddc",
  "com.scalablytyped" %%% "range-parser" % "1.2-dt-20180910Z-dfa7aa",
  "com.scalablytyped" %%% "restify" % "7.2-dt-20181104Z-f46778",
  "com.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-5d47cf",
  "com.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-59ad3f",
  "com.scalablytyped" %%% "spdy" % "3.4-dt-20180910Z-e8531e",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "swagger-node-runner" % "0.5-dt-20181027Z-e51a2f",
  "com.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20181116Z-dad23f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        