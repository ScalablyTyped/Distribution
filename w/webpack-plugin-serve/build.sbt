organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "0.10-dt-20190506Z-ceedb1"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-8db10b",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-84e0a0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-f180da",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-d03b6a",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-6c23ca",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-63d9f9",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-d92710",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-4d11bc",
  "org.scalablytyped" %%% "fast-glob" % "2.2.7-4357de",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20191115Z-7d1508",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-81205a",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-ba4afa",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20191127Z-b40dcb",
  "org.scalablytyped" %%% "koa-compress" % "v2.x-dt-20190326Z-fca2cb",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20190218Z-8e0989",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20190207Z-12e812",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-12c9b7",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-08e889",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1b75dd",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-4ff83c",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-67a687",
  "org.scalablytyped" %%% "source-map" % "0.7.3-651620",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-7c63f1",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-c659dd",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20191116Z-d0fa98",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-7974be")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        