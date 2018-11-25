organization := "com.scalablytyped"
name := "swagger-express-mw"
version := "0.7-dt-20181027Z-eb8ddc"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-83ee83",
  "com.scalablytyped" %%% "boom" % "7.2-dt-20181120Z-57c4d8",
  "com.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-2e4222",
  "com.scalablytyped" %%% "catbox" % "10.0-dt-20181121Z-df30ed",
  "com.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-6d6e76",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "express" % "4.16-dt-20180910Z-7cbe9d",
  "com.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-87f8bc",
  "com.scalablytyped" %%% "hapi" % "17.6-dt-20181121Z-e8b488",
  "com.scalablytyped" %%% "iron" % "5.0-dt-20180910Z-dab392",
  "com.scalablytyped" %%% "joi" % "14.0-dt-20181031Z-8cc4e5",
  "com.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-f9ab87",
  "com.scalablytyped" %%% "mime-db" % "1.27-dt-20180910Z-34fa5b",
  "com.scalablytyped" %%% "mimos" % "3.0-dt-20180910Z-e347b3",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "podium" % "1.0-dt-20180910Z-db7ddc",
  "com.scalablytyped" %%% "range-parser" % "1.2-dt-20180910Z-dfa7aa",
  "com.scalablytyped" %%% "restify" % "7.2-dt-20181121Z-94bf96",
  "com.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-7c0e63",
  "com.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-583f9e",
  "com.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-d4d610",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "swagger-node-runner" % "0.5-dt-20181027Z-4ecb81",
  "com.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20181121Z-399299",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        