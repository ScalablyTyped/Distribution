organization := "org.scalablytyped"
name := "webpack-serve"
version := "2.0-dt-20190212Z-a63688"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-6c767c",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-68f85b",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-1b4f69",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-b60015",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-4aabca",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-56f2e3",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191220Z-8b81e3",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20191226Z-98d69d",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20191127Z-f05fe3",
  "org.scalablytyped" %%% "loglevel" % "1.6.6-2fdad9",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20191126Z-0d8d4a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-03061a",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-b58a9e",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-314389",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-636f72",
  "org.scalablytyped" %%% "source-map" % "0.7.3-27fa0a",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200111Z-e40eb2",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-f2b840",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20200107Z-84e956",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20190624Z-e94745",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180621Z-421788",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20200116Z-e0bcef")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        