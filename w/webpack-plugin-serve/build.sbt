organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "0.10-dt-20190506Z-941d2e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-c17a5d",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-7f5e7d",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-3cddfd",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-409dd3",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-8ad0a7",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-f2c2c6",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-af9a1f",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191015Z-cfcbef",
  "org.scalablytyped" %%% "fast-glob" % "2.2.7-d5f01e",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-11791f",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-fc7687",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-1dd753",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20191016Z-7ab67d",
  "org.scalablytyped" %%% "koa-compress" % "v2.x-dt-20190326Z-f0c058",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20190218Z-bbf878",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20190207Z-640ff7",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-8e1e66",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191015Z-4f243e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c44ea2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-6388bc",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-df1e9f",
  "org.scalablytyped" %%% "source-map" % "0.7.3-54a40f",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-463316",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-2f0bcb",
  "org.scalablytyped" %%% "webpack" % "4.39-dt-20191019Z-7c3ec2",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-230cbc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        