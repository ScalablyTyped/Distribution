organization := "org.scalablytyped"
name := "yog2-kernel"
version := "1.9-dt-20181121Z-3b27fa"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-53a0b6",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-d9104d",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-7b5d5b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-15274d",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-f3a537",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-1dd39e",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "node-ral" % "0.18-dt-20181121Z-3013be",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1e193b",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-ae1f71",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "yog-bigpipe" % "0.4-dt-20180214Z-1788d3",
  "org.scalablytyped" %%% "yog-log" % "0.1-dt-20181121Z-243798")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        