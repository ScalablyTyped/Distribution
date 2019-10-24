organization := "org.scalablytyped"
name := "webpack-dev-server"
version := "3.4-dt-20191022Z-c85b24"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-7f5e7d",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-6b1423",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-5c770f",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-3f42e7",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-64180e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191015Z-8fd375",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-f12f4d",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-d1c42f",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-8e1e66",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191023Z-ebe9d8",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c44ea2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-827e1a",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-df1e9f",
  "org.scalablytyped" %%% "source-map" % "0.7.3-54a40f",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-463316",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-2f0bcb",
  "org.scalablytyped" %%% "webpack" % "4.39-dt-20191021Z-a6c7c9",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-806afb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        