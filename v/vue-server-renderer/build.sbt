organization := "org.scalablytyped"
name := "vue-server-renderer"
version := "2.5.21-af58ad"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-226182",
  "org.scalablytyped" %%% "chalk" % "2.4.1-c5701d",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-7f8b58",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-ca86dd",
  "org.scalablytyped" %%% "hash-sum" % "1.0-dt-20180910Z-64f7ff",
  "org.scalablytyped" %%% "he" % "v1.1.1-dt-20180910Z-767440",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-17fe49",
  "org.scalablytyped" %%% "lodash_dot_template" % "4.4-dt-20180910Z-cf39cc",
  "org.scalablytyped" %%% "lodash_dot_uniq" % "4.5-dt-20180910Z-a5103d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180910Z-3c99b2",
  "org.scalablytyped" %%% "serialize-javascript" % "1.5-dt-20181018Z-23e78d",
  "org.scalablytyped" %%% "source-map" % "0.7.3-a4132b",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-7348e2",
  "org.scalablytyped" %%% "vue" % "2.5.21-596968")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        