organization := "org.scalablytyped"
name := "webpack-serve"
version := "2.0-dt-20211231Z-4c967f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20211202Z-4aad84",
  "org.scalablytyped" %%% "ajv" % "8.11.0-e75802",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-4c8ee8",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20220505Z-baf750",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20211202Z-daab24",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6f817a",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-a77eec",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-80f63d",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-349280",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20211202Z-ff8589",
  "org.scalablytyped" %%% "koa" % "2.13.1-dt-20220818Z-52a22e",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "re2" % "1.17.7-9b0ba5",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-807643",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-5b9e43",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "tapable" % "2.2.1-52b605",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092",
  "org.scalablytyped" %%% "webpack" % "5.74.0-6f6163",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "5.3.3-095f3e",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.1-dt-20211223Z-09419a",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-20cc7d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
