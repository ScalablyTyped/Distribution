organization := "org.scalablytyped"
name := "webpack-blocks"
version := "2.0-dt-20211202Z-90c318"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-f4a508",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-9389e9",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-58e21d",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "re2" % "1.17.7-9752ba",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-547e57",
  "org.scalablytyped" %%% "source-map" % "0.7.4-942cbd",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "tapable" % "2.2.1-7eb940",
  "org.scalablytyped" %%% "uglify-js" % "3.17-dt-20221021Z-797199",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-d613cd",
  "org.scalablytyped" %%% "webpack" % "5.74.0-bd3f64",
  "org.scalablytyped" %%% "webpack-blocks__assets" % "2.0-dt-20211202Z-a822ea",
  "org.scalablytyped" %%% "webpack-blocks__babel" % "2.0-dt-20211202Z-8fc5af",
  "org.scalablytyped" %%% "webpack-blocks__core" % "2.0-dt-20221003Z-9bd917",
  "org.scalablytyped" %%% "webpack-blocks__dev-server" % "2.0-dt-20211202Z-1ccc69",
  "org.scalablytyped" %%% "webpack-blocks__postcss" % "2.0-dt-20211202Z-c38c77",
  "org.scalablytyped" %%% "webpack-blocks__sass" % "2.0-dt-20211202Z-fbc603",
  "org.scalablytyped" %%% "webpack-blocks__typescript" % "2.0-dt-20211202Z-da1be1",
  "org.scalablytyped" %%% "webpack-blocks__uglify" % "2.0-dt-20211202Z-87547e",
  "org.scalablytyped" %%% "webpack-blocks__webpack" % "2.0-dt-20221003Z-43af0d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
