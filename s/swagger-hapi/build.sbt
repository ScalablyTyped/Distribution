organization := "org.scalablytyped"
name := "swagger-hapi"
version := "0.7-dt-20181027Z-c6651c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-d7d4ef",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181120Z-eea1b3",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-5390c7",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20181121Z-19ab3d",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-448588",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180910Z-6e8abe",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-dfbf83",
  "org.scalablytyped" %%% "hapi" % "17.8-dt-20181129Z-90dff1",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180910Z-0492bb",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181031Z-f53b7a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-399889",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180910Z-7ba122",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180910Z-7ce4b8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180910Z-b3d782",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20180910Z-db862f",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20181121Z-3a7e77",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-c19301",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-a43e12",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-a9c117",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.5-dt-20181027Z-e4b0bf",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20181121Z-faf5be")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        