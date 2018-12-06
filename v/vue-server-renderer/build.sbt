organization := "org.scalablytyped"
name := "vue-server-renderer"
version := "2.5.17-161454"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-c75411",
  "org.scalablytyped" %%% "chalk" % "2.4.1-668e15",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-2e1e39",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-7b7662",
  "org.scalablytyped" %%% "hash-sum" % "1.0-dt-20180910Z-2a6ae3",
  "org.scalablytyped" %%% "he" % "v1.1.1-dt-20180910Z-789ce0",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-3dc8be",
  "org.scalablytyped" %%% "lodash_dot_template" % "4.4-dt-20180910Z-c60c1d",
  "org.scalablytyped" %%% "lodash_dot_uniq" % "4.5-dt-20180910Z-d89ed6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180910Z-98a713",
  "org.scalablytyped" %%% "serialize-javascript" % "1.5-dt-20181018Z-c12320",
  "org.scalablytyped" %%% "source-map" % "0.7.3-faaeaa",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-b77f09",
  "org.scalablytyped" %%% "vue" % "2.5.17-7508e2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        