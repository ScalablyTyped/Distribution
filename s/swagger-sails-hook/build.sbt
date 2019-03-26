organization := "org.scalablytyped"
name := "swagger-sails-hook"
version := "0.7-dt-20181022Z-64e1d7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-9f78fd",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-85911d",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-6e4252",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-2fac78",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-c85ddc",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-4576ab",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-506446",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190212Z-b3bc95",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-c90b69",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-e908c8",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-03fba5",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-aebc2d",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-9779a1",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-c1eb16",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-d16283",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190319Z-e49072",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-604ebf",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-6e9894",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-4dabf8",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-b8ea2b",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190220Z-3ae285")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        