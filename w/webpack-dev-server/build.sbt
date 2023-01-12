organization := "org.scalablytyped"
name := "webpack-dev-server"
version := "4.11.1-0ba405"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-e03df2",
  "org.scalablytyped" %%% "anymatch" % "3.1.2-955503",
  "org.scalablytyped" %%% "bonjour-service" % "1.0.14-35c8c5",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-35413f",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20211202Z-e0cfa5",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6dfb17",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-118d16",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-e830b8",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20220503Z-d8cf55",
  "org.scalablytyped" %%% "http-proxy-middleware" % "2.0.6-cc9b51",
  "org.scalablytyped" %%% "ipaddr_dot_js" % "2.0.1-2b1c4c",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-64302b",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-381f52",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "open" % "8.4.0-15aa25",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-625bd0",
  "org.scalablytyped" %%% "re2" % "1.17.7-31fc73",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-21a261",
  "org.scalablytyped" %%% "serve-index" % "1.9-dt-20211202Z-c09f0d",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-5be9af",
  "org.scalablytyped" %%% "sockjs" % "0.3-dt-20211202Z-61b754",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "tapable" % "2.2.1-7a5e1e",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-8d8221",
  "org.scalablytyped" %%% "webpack" % "5.75.0-5aadf4",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "5.3.3-f9266b",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-507aa7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
