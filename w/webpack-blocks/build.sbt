organization := "org.scalablytyped"
name := "webpack-blocks"
version := "2.0-dt-20211202Z-9c3acd"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-7e3772",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-e2199b",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-fff97a",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "re2" % "1.17.7-80a78e",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-635366",
  "org.scalablytyped" %%% "source-map" % "0.7.4-09b2a8",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "tapable" % "2.2.1-981407",
  "org.scalablytyped" %%% "uglify-js" % "3.17-dt-20220913Z-9f2b93",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-6052b3",
  "org.scalablytyped" %%% "webpack" % "5.74.0-504ec9",
  "org.scalablytyped" %%% "webpack-blocks__assets" % "2.0-dt-20211202Z-b695b0",
  "org.scalablytyped" %%% "webpack-blocks__babel" % "2.0-dt-20211202Z-211ebf",
  "org.scalablytyped" %%% "webpack-blocks__core" % "2.0-dt-20211202Z-288c1a",
  "org.scalablytyped" %%% "webpack-blocks__dev-server" % "2.0-dt-20211202Z-ad4c6f",
  "org.scalablytyped" %%% "webpack-blocks__postcss" % "2.0-dt-20211202Z-bcf678",
  "org.scalablytyped" %%% "webpack-blocks__sass" % "2.0-dt-20211202Z-9f04f2",
  "org.scalablytyped" %%% "webpack-blocks__typescript" % "2.0-dt-20211202Z-620036",
  "org.scalablytyped" %%% "webpack-blocks__uglify" % "2.0-dt-20211202Z-599de5",
  "org.scalablytyped" %%% "webpack-blocks__webpack" % "2.0-dt-20211202Z-1cc474")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
