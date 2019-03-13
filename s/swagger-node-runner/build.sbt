organization := "org.scalablytyped"
name := "swagger-node-runner"
version := "0.6-dt-20190212Z-d72f01"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-97355d",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-0d497d",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-91c5de",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-4efb44",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-a9f21d",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-896760",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-bea529",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190212Z-54b461",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-6f8002",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-f12d33",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-f97a6c",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-57d54e",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-af8e6b",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5082d0",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190212Z-d9429b",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-e46030",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-c2ae32",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-592551",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190220Z-335ca8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        