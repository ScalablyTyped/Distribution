organization := "org.scalablytyped"
name := "webpack-dev-server"
version := "4.11.1-26d72c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-7e3772",
  "org.scalablytyped" %%% "anymatch" % "3.1.2-5a5061",
  "org.scalablytyped" %%% "bonjour-service" % "1.0.14-2a36ad",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-0adf37",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20211202Z-7c4700",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-e2199b",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-646db4",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-53b851",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20220503Z-7ddf6d",
  "org.scalablytyped" %%% "http-proxy-middleware" % "2.0.6-132d88",
  "org.scalablytyped" %%% "ipaddr_dot_js" % "2.0.1-926e72",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-fff97a",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-fb8f3f",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "open" % "8.4.0-515694",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-4e85dc",
  "org.scalablytyped" %%% "re2" % "1.17.7-80a78e",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-635366",
  "org.scalablytyped" %%% "serve-index" % "1.9-dt-20211202Z-2c509e",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-170623",
  "org.scalablytyped" %%% "sockjs" % "0.3-dt-20211202Z-87dea0",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "tapable" % "2.2.1-981407",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-6052b3",
  "org.scalablytyped" %%% "webpack" % "5.74.0-504ec9",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "5.3.3-7dce7c",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-142b86")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
