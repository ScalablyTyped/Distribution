organization := "org.scalablytyped"
name := "webpack-serve"
version := "2.0-dt-20190212Z-524872"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-147721",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-a7db04",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-105136",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-517334",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-ed9347",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-676404",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-f1a335",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-9360b6",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-cb6875",
  "org.scalablytyped" %%% "loglevel" % "1.6.3-42c31f",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20190322Z-6a0d52",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-612693",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-c250b3",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-db4fa8",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-2a850b",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-afc896",
  "org.scalablytyped" %%% "source-map" % "0.7.3-bb5048",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-230399",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-e01dc2",
  "org.scalablytyped" %%% "webpack" % "4.39-dt-20190825Z-dbe3c4",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20190624Z-25ecf7",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180621Z-5bcb48",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-412bd8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        