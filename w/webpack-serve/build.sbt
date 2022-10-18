organization := "org.scalablytyped"
name := "webpack-serve"
version := "2.0-dt-20211231Z-65e09a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20211202Z-a1c931",
  "org.scalablytyped" %%% "ajv" % "8.11.0-6f26a9",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-897197",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20220505Z-3b4e14",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20211202Z-da09f3",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-9389e9",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-d74acb",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-06d29e",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-58e21d",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20211202Z-fc3ebd",
  "org.scalablytyped" %%% "koa" % "2.13.1-dt-20220818Z-a63c65",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-9884c6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-76627f",
  "org.scalablytyped" %%% "re2" % "1.17.7-e9900d",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-a6d40a",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-696f82",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "tapable" % "2.2.1-7eb940",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-d613cd",
  "org.scalablytyped" %%% "webpack" % "5.74.0-635f23",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "5.3.3-74b1ac",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.1-dt-20211223Z-9ce92a",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-54fbe6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
