organization := "org.scalablytyped"
name := "webpack-dev-server"
version := "4.11.1-096fd9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-8684db",
  "org.scalablytyped" %%% "anymatch" % "3.1.2-63e35b",
  "org.scalablytyped" %%% "bonjour-service" % "1.0.14-bc4069",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-e28130",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20211202Z-270226",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6f817a",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-faf4dd",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-ed8fc0",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20220503Z-75bf4e",
  "org.scalablytyped" %%% "http-proxy-middleware" % "2.0.6-248a45",
  "org.scalablytyped" %%% "ipaddr_dot_js" % "2.0.1-2f6f7f",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-349280",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "open" % "8.4.0-c6e4d5",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "re2" % "1.17.7-7aac79",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-d57fbb",
  "org.scalablytyped" %%% "serve-index" % "1.9-dt-20211202Z-2f34fb",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-f95ba3",
  "org.scalablytyped" %%% "sockjs" % "0.3-dt-20211202Z-183faf",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "tapable" % "2.2.1-52b605",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092",
  "org.scalablytyped" %%% "webpack" % "5.74.0-53ab06",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "5.3.3-29a3db",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-cacb98")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
