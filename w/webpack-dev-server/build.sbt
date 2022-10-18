organization := "org.scalablytyped"
name := "webpack-dev-server"
version := "4.11.1-0e1a01"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-6f26a9",
  "org.scalablytyped" %%% "anymatch" % "3.1.2-408111",
  "org.scalablytyped" %%% "bonjour-service" % "1.0.14-95fea4",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-5ba89d",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20211202Z-9710d1",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-9389e9",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-d74acb",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-06d29e",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20220503Z-133af7",
  "org.scalablytyped" %%% "http-proxy-middleware" % "2.0.6-59e937",
  "org.scalablytyped" %%% "ipaddr_dot_js" % "2.0.1-7ab2c9",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-58e21d",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-9884c6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "open" % "8.4.0-af6b61",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-76627f",
  "org.scalablytyped" %%% "re2" % "1.17.7-e9900d",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-a6d40a",
  "org.scalablytyped" %%% "serve-index" % "1.9-dt-20211202Z-252951",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-696f82",
  "org.scalablytyped" %%% "sockjs" % "0.3-dt-20211202Z-4457f2",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "tapable" % "2.2.1-7eb940",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-d613cd",
  "org.scalablytyped" %%% "webpack" % "5.74.0-635f23",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "5.3.3-74b1ac",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-54fbe6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
