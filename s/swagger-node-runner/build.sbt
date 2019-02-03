organization := "org.scalablytyped"
name := "swagger-node-runner"
version := "0.5-dt-20181022Z-ada764"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-4e5340",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-344433",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-25de37",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190126Z-804551",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-de8dcd",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-ea3f90",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-cd7dc7",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190119Z-5f46b7",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-25794c",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190131Z-6a437a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-45605c",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-b2cae6",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-086af5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-7174cc",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c7c39d",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20181231Z-752716",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-cb5d09",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-1f92c4",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-62282d",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20181113Z-d43a59")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        