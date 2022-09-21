organization := "org.scalablytyped"
name := "webpack-dev-server"
version := "4.11.1-645a9b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-025d79",
  "org.scalablytyped" %%% "anymatch" % "3.1.2-0b1008",
  "org.scalablytyped" %%% "bonjour-service" % "1.0.14-aa0ba1",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-6ca4bc",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20211202Z-f48bfa",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-bee5c7",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-6f01fe",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-c34bb1",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20220503Z-7f014a",
  "org.scalablytyped" %%% "http-proxy-middleware" % "2.0.6-28d13a",
  "org.scalablytyped" %%% "ipaddr_dot_js" % "2.0.1-f3fd6f",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-aaec85",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-21c0d6",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "open" % "8.4.0-9e5ae6",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-11838a",
  "org.scalablytyped" %%% "re2" % "1.17.7-22ea4f",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-ca6ee9",
  "org.scalablytyped" %%% "serve-index" % "1.9-dt-20211202Z-09a3c2",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-77d826",
  "org.scalablytyped" %%% "sockjs" % "0.3-dt-20211202Z-c7fdd1",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "tapable" % "2.2.1-b2feca",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-33748e",
  "org.scalablytyped" %%% "webpack" % "5.74.0-8b6e44",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "5.3.3-d2face",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-6883ea")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
