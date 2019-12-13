organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "0.10-dt-20190506Z-4116db"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-02d463",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-84e0a0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-dbbefd",
  "org.scalablytyped" %%% "braces" % "3.0-dt-20190422Z-034461",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-b2c6f4",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-4da3d6",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-82124d",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-7b0398",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-051e33",
  "org.scalablytyped" %%% "fast-glob" % "2.2.7-3674c6",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20191115Z-59adaa",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-fdf5ed",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-ba4afa",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20191127Z-456106",
  "org.scalablytyped" %%% "koa-compress" % "v2.x-dt-20190326Z-6da0ca",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20190218Z-0da2a0",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20190207Z-e3d12e",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20191113Z-4a7e9e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-e84c0f",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-8e4074",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191210Z-b5c359",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1b75dd",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-f2210d",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-67a687",
  "org.scalablytyped" %%% "source-map" % "0.7.3-651620",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-7c63f1",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-40c681",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20191116Z-19b194",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-155881")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        