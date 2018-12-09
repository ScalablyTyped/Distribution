organization := "org.scalablytyped"
name := "webpack-serve"
version := "2.0-dt-20180910Z-72211e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180910Z-db9c57",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180910Z-5af0d9",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-5f074c",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-95bd8f",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180910Z-ef0760",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180910Z-c7573b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-702174",
  "org.scalablytyped" %%% "http-assert" % "1.3-dt-20181121Z-ae5f42",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180910Z-9bb5e0",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181120Z-3c3b26",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20180910Z-42698d",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20180910Z-15ef59",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20180920Z-5a6502",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-60e32c",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181208Z-7e710f",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-35654c",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4f6afc",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180910Z-9fb0f3",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181018Z-ca77c5",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181129Z-961fa8",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180910Z-da52bc",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180910Z-51cabe")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        