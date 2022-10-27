organization := "org.scalablytyped"
name := "webpack-dev-server"
version := "4.11.1-17566b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-fcbdcb",
  "org.scalablytyped" %%% "anymatch" % "3.1.2-63e35b",
  "org.scalablytyped" %%% "bonjour-service" % "1.0.14-453f11",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-e82333",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20211202Z-1a5bb2",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6f817a",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-7a82fe",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-87e3cc",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20220503Z-0f9f0a",
  "org.scalablytyped" %%% "http-proxy-middleware" % "2.0.6-dbeea4",
  "org.scalablytyped" %%% "ipaddr_dot_js" % "2.0.1-2f6f7f",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-349280",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "open" % "8.4.0-270fcf",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "re2" % "1.17.7-18b669",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-9310ee",
  "org.scalablytyped" %%% "serve-index" % "1.9-dt-20211202Z-9e571e",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-5e7139",
  "org.scalablytyped" %%% "sockjs" % "0.3-dt-20211202Z-1f082c",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "tapable" % "2.2.1-52b605",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092",
  "org.scalablytyped" %%% "webpack" % "5.74.0-641d67",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "5.3.3-7fe4c4",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-2ad085")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
