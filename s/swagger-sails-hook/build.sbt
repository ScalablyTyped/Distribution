organization := "org.scalablytyped"
name := "swagger-sails-hook"
version := "0.7-dt-20181022Z-641905"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-322647",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-344433",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-bf5473",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190126Z-804551",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-fba25e",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-aabd2b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-f1d2dc",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190119Z-7b86c5",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-47ec69",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190131Z-6a437a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-b2cae6",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-086af5",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-7174cc",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c7c39d",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20181231Z-40846b",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-308d11",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-7a013f",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-7dd99f",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.5-dt-20181022Z-9e8558",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20181113Z-d43a59")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        