organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "0.10-dt-20190506Z-a9c52d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-1fdfc6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-7f5e7d",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-a83d81",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-e438a4",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-66bcb8",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-aba9d8",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-e44937",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-a3652a",
  "org.scalablytyped" %%% "fast-glob" % "2.2.7-b09840",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-ff7a52",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-6aa387",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-1dd753",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190925Z-00121b",
  "org.scalablytyped" %%% "koa-compress" % "v2.x-dt-20190326Z-a02eaa",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20190218Z-a74b70",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20190207Z-c2dd7e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-8e1e66",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-c62b25",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c44ea2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-84f8ef",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-df1e9f",
  "org.scalablytyped" %%% "source-map" % "0.7.3-54a40f",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-463316",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-2f0bcb",
  "org.scalablytyped" %%% "webpack" % "4.39-dt-20191009Z-e7bb9d",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-dce0cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        