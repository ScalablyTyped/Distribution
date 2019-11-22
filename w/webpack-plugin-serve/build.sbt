organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "0.10-dt-20190506Z-09e686"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-68f05e",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-e7b0ed",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-651b1b",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-025d27",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-50d6cb",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-d6da34",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-e9b754",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-5f40d1",
  "org.scalablytyped" %%% "fast-glob" % "2.2.7-12174a",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20191115Z-a8220f",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-4acadc",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-215745",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20191107Z-3dde95",
  "org.scalablytyped" %%% "koa-compress" % "v2.x-dt-20190326Z-64f831",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20190218Z-d01a29",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20190207Z-fbbd3e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-301fe0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191119Z-94c257",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ebcbf",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-aab1df",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-402452",
  "org.scalablytyped" %%% "source-map" % "0.7.3-00bd51",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-1ad099",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-391be5",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20191116Z-037b04",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-11f707")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        