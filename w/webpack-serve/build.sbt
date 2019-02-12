organization := "org.scalablytyped"
name := "webpack-serve"
version := "2.0-dt-20180712Z-ff8f5f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-5f198b",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-a09216",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-322647",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-fba25e",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-fc2db3",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-aabd2b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-f1d2dc",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-9dedb2",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-9719d3",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-939f92",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-4bd8b6",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20190205Z-0b789a",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20180919Z-707d9a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c7c39d",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-308d11",
  "org.scalablytyped" %%% "source-map" % "0.7.3-cdf339",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-2fd0f1",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-876284",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190116Z-6291f4",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-c9a564",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180621Z-2caad6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        