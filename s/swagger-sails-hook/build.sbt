organization := "org.scalablytyped"
name := "swagger-sails-hook"
version := "0.7-dt-20181022Z-2f404b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-53a0b6",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-6e71a0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-b05538",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-31233f",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-d9104d",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-7b5d5b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-15274d",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190212Z-dd7c23",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-e6924f",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-d23d37",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-1dd39e",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-9ef634",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-385173",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-5dab68",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1e193b",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190212Z-bdb40c",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-ae1f71",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-476661",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-ff434a",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-e0774e",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190220Z-cccae5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        