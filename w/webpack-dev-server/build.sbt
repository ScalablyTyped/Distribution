organization := "com.scalablytyped"
name := "webpack-dev-server"
version := "3.1-dt-20181102Z-9c77aa"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "anymatch" % "1.3-dt-20181102Z-81c269",
  "com.scalablytyped" %%% "body-parser" % "1.17-dt-20181102Z-5991c4",
  "com.scalablytyped" %%% "connect" % "v3.4.0-dt-20181102Z-210269",
  "com.scalablytyped" %%% "express" % "4.16-dt-20181102Z-d3111c",
  "com.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20181102Z-8da2fa",
  "com.scalablytyped" %%% "http-proxy" % "1.16-dt-20181102Z-2efca3",
  "com.scalablytyped" %%% "http-proxy-middleware" % "0.17-dt-20181102Z-2da1f1",
  "com.scalablytyped" %%% "mime" % "2.0-dt-20181102Z-16ee55",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "range-parser" % "1.2-dt-20181102Z-399813",
  "com.scalablytyped" %%% "serve-static" % "1.13-dt-20181102Z-c1072c",
  "com.scalablytyped" %%% "source-map" % "0.7.3-771552",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "tapable" % "v1.0.0-dt-20181102Z-d10221",
  "com.scalablytyped" %%% "uglify-js" % "3.0-dt-20181102Z-f3dae8",
  "com.scalablytyped" %%% "webpack" % "4.4-dt-20181116Z-80c872",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        