organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "0.10-dt-20190506Z-071198"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-93a6c5",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-b477a2",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-aabbef",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-db6ee1",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-555f6e",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-88e72c",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-3b7640",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-dff786",
  "org.scalablytyped" %%% "fast-glob" % "2.2.7-bbba7c",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-f0dee3",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-751d56",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-6958e3",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190925Z-edb300",
  "org.scalablytyped" %%% "koa-compress" % "v2.x-dt-20190326Z-7b515a",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20190218Z-7720e6",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20190207Z-aecc4d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-51ab0c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-8637fd",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-0d10b5",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-e134e0",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-0f384b",
  "org.scalablytyped" %%% "source-map" % "0.7.3-293c86",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-6bf1a0",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-5e730c",
  "org.scalablytyped" %%% "webpack" % "4.39-dt-20191009Z-273d6b",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-f1ed58")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        