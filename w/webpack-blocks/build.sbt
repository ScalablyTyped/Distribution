organization := "org.scalablytyped"
name := "webpack-blocks"
version := "2.0-dt-20211202Z-b918d7"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-5adede",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-1ed7c2",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-aa50bf",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "re2" % "1.17.7-349e63",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-16f8fb",
  "org.scalablytyped" %%% "source-map" % "0.7.4-114bc3",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "tapable" % "2.2.1-8e2762",
  "org.scalablytyped" %%% "uglify-js" % "3.17-dt-20221021Z-e681ff",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-af3fab",
  "org.scalablytyped" %%% "webpack" % "5.75.0-4fd6d9",
  "org.scalablytyped" %%% "webpack-blocks__assets" % "2.0-dt-20211202Z-420995",
  "org.scalablytyped" %%% "webpack-blocks__babel" % "2.0-dt-20211202Z-df8b29",
  "org.scalablytyped" %%% "webpack-blocks__core" % "2.0-dt-20221003Z-9d2e80",
  "org.scalablytyped" %%% "webpack-blocks__dev-server" % "2.0-dt-20211202Z-889999",
  "org.scalablytyped" %%% "webpack-blocks__postcss" % "2.0-dt-20211202Z-582cfa",
  "org.scalablytyped" %%% "webpack-blocks__sass" % "2.0-dt-20211202Z-fc9fcd",
  "org.scalablytyped" %%% "webpack-blocks__typescript" % "2.0-dt-20211202Z-848d58",
  "org.scalablytyped" %%% "webpack-blocks__uglify" % "2.0-dt-20211202Z-41a427",
  "org.scalablytyped" %%% "webpack-blocks__webpack" % "2.0-dt-20221003Z-ba7cba")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
