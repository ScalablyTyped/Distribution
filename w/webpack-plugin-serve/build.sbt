organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "0.7-dt-20190326Z-81aff4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-a6f0e2",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-c26764",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-b7a897",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-d1a562",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190326Z-461092",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-4e7c9d",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-481648",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190429Z-7ae182",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-385788",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-28c6f5",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-be3057",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-b066af",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-1a0fa1",
  "org.scalablytyped" %%% "koa-compress" % "v2.x-dt-20190326Z-24f917",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20190218Z-455049",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20190207Z-af7724",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-7c1445",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-40b461",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-565137",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-3f05df",
  "org.scalablytyped" %%% "source-map" % "0.7.3-6cb46e",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-6fe94b",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-a6952d",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190428Z-0cf455")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        