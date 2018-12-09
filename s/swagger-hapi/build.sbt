organization := "org.scalablytyped"
name := "swagger-hapi"
version := "0.7-dt-20181027Z-d82b75"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-1e3d17",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181120Z-fca4be",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-5a815f",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20181121Z-1a4427",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-2435e6",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180910Z-f86790",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-df22ad",
  "org.scalablytyped" %%% "hapi" % "17.8-dt-20181129Z-06ab9c",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180910Z-f1d85c",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181031Z-4c4c5e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-08f14a",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180910Z-f160ca",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180910Z-584e1d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180910Z-beab25",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181208Z-85fa0c",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20181121Z-44390a",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-8ad61a",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-8d66c3",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-ca6c6e",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.5-dt-20181027Z-7e4785",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20181121Z-753905")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        