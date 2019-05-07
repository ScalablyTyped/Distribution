organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "0.10-dt-20190506Z-bda5b0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-e3acbb",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-c5c3e6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-56ad56",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-a597fb",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190326Z-56b51d",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-6e9d70",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-5ac7c3",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190429Z-99402a",
  "org.scalablytyped" %%% "fast-glob" % "2.2.6-e39317",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-8e95e6",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-1adc14",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-b7c6ed",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-527b16",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-f5f2f9",
  "org.scalablytyped" %%% "koa-compress" % "v2.x-dt-20190326Z-b41dc7",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20190218Z-05a0cf",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20190207Z-25d92f",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-169399",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-6753fb",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-acf35f",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-94d189",
  "org.scalablytyped" %%% "source-map" % "0.7.3-c62343",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-98777a",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-32bf87",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190506Z-14c287")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        