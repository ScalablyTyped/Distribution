organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "0.10-dt-20190506Z-9167dc"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-d94377",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-b477a2",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-e27953",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-62c2b3",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-b15335",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-baa76c",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-06675e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-8c6b3a",
  "org.scalablytyped" %%% "fast-glob" % "2.2.7-d7ba11",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-09bab7",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-44e449",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-6958e3",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190925Z-5639e9",
  "org.scalablytyped" %%% "koa-compress" % "v2.x-dt-20190326Z-e67e36",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20190218Z-7d7f2f",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20190207Z-f48e06",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-51ab0c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-a35ed6",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-0d10b5",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-f18a47",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-0f384b",
  "org.scalablytyped" %%% "source-map" % "0.7.3-293c86",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-6bf1a0",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-5e730c",
  "org.scalablytyped" %%% "webpack" % "4.39-dt-20190928Z-748169",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-801efe")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        