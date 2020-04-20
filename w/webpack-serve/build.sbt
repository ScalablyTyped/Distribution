organization := "org.scalablytyped"
name := "webpack-serve"
version := "2.0-dt-20200226Z-17ba3f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-faa220",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-1bb4ae",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-e204eb",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200226Z-677666",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20200331Z-650a48",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-c7af76",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200409Z-704088",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200415Z-afdfd2",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20191226Z-74aed5",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20200327Z-6cad27",
  "org.scalablytyped" %%% "loglevel" % "1.6.8-ea5aea",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20200225Z-859524",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-cd6086",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200225Z-6c439e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-0a8d6e",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200227Z-c88828",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20200225Z-0c1f94",
  "org.scalablytyped" %%% "source-map" % "0.7.3-61a869",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200225Z-7c6f60",
  "org.scalablytyped" %%% "uglify-js" % "3.9-dt-20200413Z-ae3cf4",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20200418Z-3147f9",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "3.7-dt-20200226Z-d192be",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.1-dt-20200225Z-d4d1fd",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20200323Z-81ab5f",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200413Z-deeaca")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
