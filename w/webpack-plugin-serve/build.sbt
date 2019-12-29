organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "0.10-dt-20190506Z-39d2ee"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-894834",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-5d9733",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-b0b0d9",
  "org.scalablytyped" %%% "braces" % "3.0-dt-20190422Z-55018e",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-f02e41",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-7e965c",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-a6e038",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-92e6db",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191220Z-1ddd6d",
  "org.scalablytyped" %%% "fast-glob" % "2.2.7-74c8b3",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20191115Z-7c0d97",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-5d6141",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20191226Z-647d39",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20191127Z-76fdef",
  "org.scalablytyped" %%% "koa-compress" % "v2.x-dt-20190326Z-4336c9",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20190218Z-cd6039",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20190207Z-b38ac1",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20191113Z-d1c8ee",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-d3b7b2",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-4f2a9c",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-a681e2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-a1ed43",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-7e3aa1",
  "org.scalablytyped" %%% "source-map" % "0.7.3-e7ea21",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-f0f427",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-3ef08e",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20191116Z-4580f3",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-c6dcfb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        