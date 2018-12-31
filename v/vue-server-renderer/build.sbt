organization := "org.scalablytyped"
name := "vue-server-renderer"
version := "2.5.21-0b7bc9"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-25ff53",
  "org.scalablytyped" %%% "chalk" % "2.4.1-b06515",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-a35d04",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-4eeb6b",
  "org.scalablytyped" %%% "hash-sum" % "1.0-dt-20180822Z-992671",
  "org.scalablytyped" %%% "he" % "v1.1.1-dt-20180507Z-42b8d3",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-0a02fb",
  "org.scalablytyped" %%% "lodash_dot_template" % "4.4-dt-20180723Z-d62414",
  "org.scalablytyped" %%% "lodash_dot_uniq" % "4.5-dt-20180723Z-407c46",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180507Z-5fd60a",
  "org.scalablytyped" %%% "serialize-javascript" % "1.5-dt-20181015Z-d4a6d3",
  "org.scalablytyped" %%% "source-map" % "0.7.3-fc8207",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-a489b6",
  "org.scalablytyped" %%% "vue" % "2.5.21-62b24a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        