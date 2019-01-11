organization := "org.scalablytyped"
name := "webpack-serve"
version := "2.0-dt-20180712Z-6070f9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-cbfc67",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-09ec76",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-756d43",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-7c4262",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-f565c6",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180603Z-8f4d08",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-af1292",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-18ffc1",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-43067a",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-51f4a6",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20180214Z-7f96e5",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20180214Z-66e19c",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20180919Z-76fdf2",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-6294fd",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-d115b2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-91019c",
  "org.scalablytyped" %%% "source-map" % "0.7.3-238ef8",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-db8d14",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-11a316",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181221Z-689a21",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-e49b65",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180621Z-e30d93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        