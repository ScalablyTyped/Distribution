organization := "org.scalablytyped"
name := "webpack-plugin-serve"
version := "0.10-dt-20190506Z-83801d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-e4863f",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-e7b0ed",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-b36108",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-a0f3dc",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-de8748",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-fe9222",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-24df32",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-4dd221",
  "org.scalablytyped" %%% "fast-glob" % "2.2.7-11cd46",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20191115Z-eeec8d",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-3fb9ee",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-215745",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20191107Z-ef73cd",
  "org.scalablytyped" %%% "koa-compress" % "v2.x-dt-20190326Z-ba20e4",
  "org.scalablytyped" %%% "koa-send" % "4.1-dt-20190218Z-7c3f8f",
  "org.scalablytyped" %%% "koa-static" % "4.0-dt-20190207Z-a1c11e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-301fe0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-304e79",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ebcbf",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-37db83",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-402452",
  "org.scalablytyped" %%% "source-map" % "0.7.3-00bd51",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-1ad099",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-391be5",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20191116Z-88f325",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-03e576")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        