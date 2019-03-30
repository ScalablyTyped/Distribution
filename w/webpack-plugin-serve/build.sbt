organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "0.7-dt-20190325Z-195153"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-8da082",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-6f800f",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-684e50",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-50cbb3",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190325Z-371df0",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-e977e6",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-4aab25",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-faea1f",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-0cd2ad",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-bccc8a",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-80fbd3",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-cf9c5c",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-2f78df",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-2b27d0",
  "org.scalablytyped" %%% "koa-compress" % "v2.x-dt-20190325Z-6fa7c9",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20190218Z-5c4a8d",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20190207Z-737ec2",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-2631f3",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-623d43",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-dd9008",
  "org.scalablytyped" %%% "source-map" % "0.7.3-1b6210",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-20a77d",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-c8c046",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190316Z-fe1f50")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        