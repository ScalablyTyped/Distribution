organization := "org.scalablytyped"
name := "webpack-serve"
version := "2.0-dt-20180712Z-81f7e7"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-208775",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-47e07f",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-e65c03",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-38b4a6",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-a1165f",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180603Z-05cc5e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-776b92",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-10ee03",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-ef7ada",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181106Z-dd5f7e",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20180214Z-2abf67",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20180214Z-d484f8",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20180919Z-7748b2",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b650df",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-ef877c",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-f8f5d7",
  "org.scalablytyped" %%% "source-map" % "0.7.3-242c07",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-48b551",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-603838",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181221Z-7f54f8",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-fe6f59",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180621Z-598b76")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        