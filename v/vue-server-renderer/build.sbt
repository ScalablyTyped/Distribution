organization := "com.scalablytyped"
name := "vue-server-renderer"
version := "2.5.17-3d43ff"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181102Z-d346e3",
  "com.scalablytyped" %%% "chalk" % "2.4.1-ef8d2c",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20181102Z-8ba882",
  "com.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20181102Z-6ced09",
  "com.scalablytyped" %%% "hash-sum" % "1.0-dt-20181102Z-98cf9c",
  "com.scalablytyped" %%% "he" % "v1.1.1-dt-20181102Z-89114d",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181109Z-67570f",
  "com.scalablytyped" %%% "lodash_dot_template" % "4.4-dt-20181102Z-3ccd1e",
  "com.scalablytyped" %%% "lodash_dot_uniq" % "4.5-dt-20181102Z-6e2a44",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20181102Z-28ea11",
  "com.scalablytyped" %%% "serialize-javascript" % "1.5-dt-20181102Z-89a3fa",
  "com.scalablytyped" %%% "source-map" % "0.7.3-771552",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "supports-color" % "5.3-dt-20181102Z-2c93a8",
  "com.scalablytyped" %%% "vue" % "2.5.17-7612f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        