organization := "org.scalablytyped"
name := "webpack-blocks"
version := "2.0-dt-20211202Z-54b63e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-e03df2",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6dfb17",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-64302b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "re2" % "1.17.7-31fc73",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-21a261",
  "org.scalablytyped" %%% "source-map" % "0.7.4-0d2ade",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "tapable" % "2.2.1-7a5e1e",
  "org.scalablytyped" %%% "uglify-js" % "3.17-dt-20221021Z-85ce15",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-8d8221",
  "org.scalablytyped" %%% "webpack" % "5.75.0-5aadf4",
  "org.scalablytyped" %%% "webpack-blocks__assets" % "2.0-dt-20211202Z-7794ac",
  "org.scalablytyped" %%% "webpack-blocks__babel" % "2.0-dt-20211202Z-b6e1aa",
  "org.scalablytyped" %%% "webpack-blocks__core" % "2.0-dt-20221003Z-859823",
  "org.scalablytyped" %%% "webpack-blocks__dev-server" % "2.0-dt-20211202Z-063de8",
  "org.scalablytyped" %%% "webpack-blocks__postcss" % "2.0-dt-20211202Z-e51ab1",
  "org.scalablytyped" %%% "webpack-blocks__sass" % "2.0-dt-20211202Z-b9ddf2",
  "org.scalablytyped" %%% "webpack-blocks__typescript" % "2.0-dt-20211202Z-8913f9",
  "org.scalablytyped" %%% "webpack-blocks__uglify" % "2.0-dt-20211202Z-7fc382",
  "org.scalablytyped" %%% "webpack-blocks__webpack" % "2.0-dt-20221003Z-c98150")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
