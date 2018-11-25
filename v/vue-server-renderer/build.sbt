organization := "com.scalablytyped"
name := "vue-server-renderer"
version := "2.5.17-ca68bd"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-16b038",
  "com.scalablytyped" %%% "chalk" % "2.4.1-ea2afe",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-566c3e",
  "com.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-76e9e4",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "hash-sum" % "1.0-dt-20180910Z-91a12e",
  "com.scalablytyped" %%% "he" % "v1.1.1-dt-20180910Z-ee0146",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-caf0c5",
  "com.scalablytyped" %%% "lodash_dot_template" % "4.4-dt-20180910Z-faaed3",
  "com.scalablytyped" %%% "lodash_dot_uniq" % "4.5-dt-20180910Z-95b1a6",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180910Z-3e672d",
  "com.scalablytyped" %%% "serialize-javascript" % "1.5-dt-20181018Z-872eab",
  "com.scalablytyped" %%% "source-map" % "0.7.3-2a06d1",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-f11a37",
  "com.scalablytyped" %%% "vue" % "2.5.17-0b0f80",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        