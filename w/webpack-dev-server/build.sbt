organization := "org.scalablytyped"
name := "webpack-dev-server"
version := "3.9-dt-20191127Z-42160e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-d4520c",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-ea079a",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-224a28",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-b1326b",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-2df7b1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191220Z-488272",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20191115Z-f4a573",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-8b5714",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-e32d86",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-166e61",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-ba7911",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-beaace",
  "org.scalablytyped" %%% "source-map" % "0.7.3-f4c7eb",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-d92267",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-0ca3a8",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20191230Z-daa3a0",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-f093f9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        