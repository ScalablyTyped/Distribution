organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "0.10-dt-20190506Z-83857b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-2c0b18",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-84e0a0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-5c00d3",
  "org.scalablytyped" %%% "braces" % "3.0-dt-20190422Z-034461",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-3ec72b",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-939227",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-f62a57",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-10cbdd",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-49513f",
  "org.scalablytyped" %%% "fast-glob" % "2.2.7-0dc162",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20191115Z-05d5d3",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-e3ba49",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-ba4afa",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20191127Z-891b59",
  "org.scalablytyped" %%% "koa-compress" % "v2.x-dt-20190326Z-79bf18",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20190218Z-7005f9",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20190207Z-e62e30",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20191113Z-4a7e9e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-e84c0f",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-ae739f",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1b75dd",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-1f57e0",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-67a687",
  "org.scalablytyped" %%% "source-map" % "0.7.3-651620",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-7c63f1",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-40c681",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20191116Z-f7ef3e",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-05c57b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        