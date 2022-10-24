organization := "org.scalablytyped"
name := "webpack-dev-server"
version := "4.11.1-7e6a23"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-e75802",
  "org.scalablytyped" %%% "anymatch" % "3.1.2-63e35b",
  "org.scalablytyped" %%% "bonjour-service" % "1.0.14-cd8390",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-548487",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20211202Z-606a4b",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6f817a",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-a77eec",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-80f63d",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20220503Z-138658",
  "org.scalablytyped" %%% "http-proxy-middleware" % "2.0.6-620483",
  "org.scalablytyped" %%% "ipaddr_dot_js" % "2.0.1-2f6f7f",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-349280",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "open" % "8.4.0-a1af84",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "re2" % "1.17.7-9b0ba5",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-807643",
  "org.scalablytyped" %%% "serve-index" % "1.9-dt-20211202Z-e27c0d",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-5b9e43",
  "org.scalablytyped" %%% "sockjs" % "0.3-dt-20211202Z-ee9756",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "tapable" % "2.2.1-52b605",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092",
  "org.scalablytyped" %%% "webpack" % "5.74.0-6f6163",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "5.3.3-095f3e",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-20cc7d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
