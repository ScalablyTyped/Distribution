organization := "org.scalablytyped"
name := "swagger-sails-hook"
version := "0.7-dt-20181022Z-d78934"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-ac6a7b",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-0d497d",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-b3bd99",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-4efb44",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-9339aa",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-6d51ab",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-0c8bec",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190212Z-b0d5e3",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-e0348f",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-455d3a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-f97a6c",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-57d54e",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190319Z-4635bc",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-af8e6b",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5082d0",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190319Z-fb2f50",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-2a152d",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-eb4d21",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-6eba71",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-b9b9ec",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190220Z-335ca8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        