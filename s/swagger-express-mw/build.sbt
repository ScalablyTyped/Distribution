organization := "org.scalablytyped"
name := "swagger-express-mw"
version := "0.7-dt-20181022Z-e1a302"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-4a385a",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-d14003",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-0b2b5e",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190126Z-5d7ee5",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-f52607",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-613b84",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-1d8801",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190119Z-c8b14a",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-5a03d0",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190131Z-30077a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-5089c8",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-985e34",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-6afcaa",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-b757dc",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-145d73",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20181231Z-47bf94",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-146c83",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-acf65b",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-254fda",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.5-dt-20181022Z-cbd1b6",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20181113Z-89fdb2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        