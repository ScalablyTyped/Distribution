organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "0.7-dt-20190326Z-02dfff"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-ea2514",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-c26764",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-cbed34",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-39eb3a",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190326Z-2b535f",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-f2b6db",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-ca686a",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190429Z-2fca98",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-6338c0",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-53dac0",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-be3057",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-9d4a0f",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-1a0fa1",
  "org.scalablytyped" %%% "koa-compress" % "v2.x-dt-20190326Z-f319a5",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20190218Z-6658d4",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20190207Z-e4ada3",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-7c1445",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-d681c7",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-565137",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-75052f",
  "org.scalablytyped" %%% "source-map" % "0.7.3-6cb46e",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-6fe94b",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-a6952d",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190428Z-92c604")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        