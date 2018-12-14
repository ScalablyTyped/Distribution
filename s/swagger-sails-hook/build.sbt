organization := "org.scalablytyped"
name := "swagger-sails-hook"
version := "0.7-dt-20181027Z-98317f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-addcd5",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181120Z-678fe2",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-6cac35",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20181121Z-9fafc7",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-564d85",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180910Z-50ee2c",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-a97c36",
  "org.scalablytyped" %%% "hapi" % "17.8-dt-20181214Z-db04f6",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180910Z-1fc1dc",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181213Z-9b3760",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-1d49f8",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180910Z-90fc20",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180910Z-66eb34",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180910Z-7ccab7",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181208Z-481dd9",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20181121Z-536930",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-eb00ce",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-878ba9",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-fb71df",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.5-dt-20181027Z-3d5aba",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20181121Z-f9a96a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        