organization := "org.scalablytyped"
name := "webpack-serve"
version := "2.0-dt-20211231Z-2cbc29"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20211202Z-216748",
  "org.scalablytyped" %%% "ajv" % "8.11.2-96c572",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-36a2d0",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20220505Z-0b924b",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20211202Z-683786",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-1eb2b4",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-cb1e35",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-5f1c10",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-6d1302",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20211202Z-10d7c9",
  "org.scalablytyped" %%% "koa" % "2.13.1-dt-20220818Z-58744c",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-85c9dc",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-137229",
  "org.scalablytyped" %%% "re2" % "1.17.7-41dbc1",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-427ce3",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-d3379f",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "tapable" % "2.2.1-ad807d",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-4bb631",
  "org.scalablytyped" %%% "webpack" % "5.75.0-18231e",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "5.3.3-e6d07b",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.1-dt-20211223Z-f495bb",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-3574d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
