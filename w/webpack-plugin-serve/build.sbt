organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "0.10-dt-20190506Z-57275c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-faa220",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-1bb4ae",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-e204eb",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200226Z-677666",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-0cb552",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20200331Z-650a48",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-c7af76",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200409Z-704088",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200415Z-afdfd2",
  "org.scalablytyped" %%% "fast-glob" % "3.2.2-5be3b9",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20200320Z-fc48a2",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-5b072d",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20191226Z-74aed5",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20200327Z-6cad27",
  "org.scalablytyped" %%% "koa-compress" % "v2.x-dt-20200226Z-ca587b",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20200226Z-94e438",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20200226Z-b14263",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-cd6086",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.3-27186a",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.3-e2f00d",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.4-1d7dd8",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200225Z-6c439e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-0a8d6e",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200227Z-c88828",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20200225Z-0c1f94",
  "org.scalablytyped" %%% "source-map" % "0.7.3-61a869",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200225Z-7c6f60",
  "org.scalablytyped" %%% "uglify-js" % "3.9-dt-20200413Z-ae3cf4",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20200418Z-3147f9",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20200323Z-81ab5f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
