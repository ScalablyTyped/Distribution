organization := "org.scalablytyped"
name := "webpack-blocks"
version := "2.0-dt-20211202Z-f7b4d8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.12.0-6bf940",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20230419Z-f51b02",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-c415ea",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "re2" % "1.18.0-0ff8d6",
  "org.scalablytyped" %%% "schema-utils" % "4.0.1-eeb615",
  "org.scalablytyped" %%% "source-map" % "0.7.4-e1e422",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "tapable" % "2.2.1-b557e4",
  "org.scalablytyped" %%% "uglify-js" % "3.17-dt-20221021Z-3ba70d",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-347272",
  "org.scalablytyped" %%% "webpack" % "5.82.1-fe40a3",
  "org.scalablytyped" %%% "webpack-blocks__assets" % "2.0-dt-20211202Z-fa9855",
  "org.scalablytyped" %%% "webpack-blocks__babel" % "2.0-dt-20211202Z-8a91d6",
  "org.scalablytyped" %%% "webpack-blocks__core" % "2.0-dt-20221003Z-0fba06",
  "org.scalablytyped" %%% "webpack-blocks__dev-server" % "2.0-dt-20211202Z-aa3b1b",
  "org.scalablytyped" %%% "webpack-blocks__postcss" % "2.0-dt-20211202Z-61ac1e",
  "org.scalablytyped" %%% "webpack-blocks__sass" % "2.0-dt-20211202Z-3cd40e",
  "org.scalablytyped" %%% "webpack-blocks__typescript" % "2.0-dt-20211202Z-d841e4",
  "org.scalablytyped" %%% "webpack-blocks__uglify" % "2.0-dt-20211202Z-639c0c",
  "org.scalablytyped" %%% "webpack-blocks__webpack" % "2.0-dt-20221003Z-dce711")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
