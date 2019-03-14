organization := "org.scalablytyped"
name := "webpack-serve"
version := "2.0-dt-20190212Z-8bd06e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-b7228a",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-f2620c",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-c5c4e3",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-fd1784",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-d71e62",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-68b458",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-02a1c5",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-07f032",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-96c7ba",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-61ce53",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-2880d6",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20190205Z-ba8ba9",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20180919Z-59987b",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190313Z-f6d9fe",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5082d0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-b44a76",
  "org.scalablytyped" %%% "source-map" % "0.7.3-169991",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-c57887",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-ffccaa",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190222Z-c5392d",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-319f1c",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180621Z-4b54c1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        