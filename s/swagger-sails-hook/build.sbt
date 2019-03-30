organization := "org.scalablytyped"
name := "swagger-sails-hook"
version := "0.7-dt-20181022Z-7a71fe"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-684e50",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-bd3199",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-043064",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-6773cd",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-50cbb3",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-4aab25",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-faea1f",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190212Z-8eb239",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-64d5ef",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-86a92a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-2631f3",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-ea22a6",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-dedbe7",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-e48ffc",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-623d43",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190319Z-c457ff",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-dd9008",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-05e9c7",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-6e52d5",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-0d7613",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190220Z-890a05")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        