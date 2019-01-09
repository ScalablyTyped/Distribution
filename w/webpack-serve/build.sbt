organization := "org.scalablytyped"
name := "webpack-serve"
version := "2.0-dt-20180712Z-3c0985"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-a76ae9",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-c183c0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-07367a",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-2e760b",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-174a7c",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180603Z-b9978d",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-afbe4d",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-89a1a3",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-92f676",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-a83ef9",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20180214Z-1ca86a",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20180214Z-c95ede",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20180919Z-32643f",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b17d95",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-13d69c",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-3abc85",
  "org.scalablytyped" %%% "source-map" % "0.7.3-8fe344",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-e50996",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-bd0e3f",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181221Z-f6f4be",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-b9c571",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180621Z-e7b6a7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        