organization := "org.scalablytyped"
name := "webpack-blocks"
version := "2.0-dt-20211202Z-efc880"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-3b5adf",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-9e7169",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-fdd79d",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "re2" % "1.17.7-7b689a",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-dd595f",
  "org.scalablytyped" %%% "source-map" % "0.7.4-c99616",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "tapable" % "2.2.1-ad9de2",
  "org.scalablytyped" %%% "uglify-js" % "3.17-dt-20221021Z-35cead",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-9ebd39",
  "org.scalablytyped" %%% "webpack" % "5.75.0-1b9e73",
  "org.scalablytyped" %%% "webpack-blocks__assets" % "2.0-dt-20211202Z-0e73a6",
  "org.scalablytyped" %%% "webpack-blocks__babel" % "2.0-dt-20211202Z-e2a92b",
  "org.scalablytyped" %%% "webpack-blocks__core" % "2.0-dt-20221003Z-75d5df",
  "org.scalablytyped" %%% "webpack-blocks__dev-server" % "2.0-dt-20211202Z-f09e89",
  "org.scalablytyped" %%% "webpack-blocks__postcss" % "2.0-dt-20211202Z-58c49e",
  "org.scalablytyped" %%% "webpack-blocks__sass" % "2.0-dt-20211202Z-b08bcc",
  "org.scalablytyped" %%% "webpack-blocks__typescript" % "2.0-dt-20211202Z-321e6f",
  "org.scalablytyped" %%% "webpack-blocks__uglify" % "2.0-dt-20211202Z-7f9d24",
  "org.scalablytyped" %%% "webpack-blocks__webpack" % "2.0-dt-20221003Z-526591")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
