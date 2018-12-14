organization := "org.scalablytyped"
name := "webpack-serve"
version := "2.0-dt-20180910Z-6be14c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180910Z-5e1aa3",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180910Z-940dc4",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-addcd5",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-564d85",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180910Z-e4e79e",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180910Z-50ee2c",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-a97c36",
  "org.scalablytyped" %%% "http-assert" % "1.3-dt-20181121Z-d4127c",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180910Z-22f4ec",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181120Z-23d243",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20180910Z-c1542c",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20180910Z-5f3128",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20180920Z-3cec44",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-1d49f8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181208Z-481dd9",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-eb00ce",
  "org.scalablytyped" %%% "source-map" % "0.7.3-a4132b",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180910Z-ea4dd1",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181018Z-d845d1",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181210Z-208f59",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180910Z-812687",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180910Z-51ddf1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        