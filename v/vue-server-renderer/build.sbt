organization := "org.scalablytyped"
name := "vue-server-renderer"
version := "2.5.22-cd56f0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-21090e",
  "org.scalablytyped" %%% "chalk" % "2.4.2-8e87c7",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-de46de",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-98c322",
  "org.scalablytyped" %%% "hash-sum" % "1.0-dt-20180822Z-46a630",
  "org.scalablytyped" %%% "he" % "v1.1.1-dt-20180507Z-1d5b2e",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-e5b16b",
  "org.scalablytyped" %%% "lodash_dot_template" % "4.4-dt-20180723Z-bfe9a4",
  "org.scalablytyped" %%% "lodash_dot_uniq" % "4.5-dt-20180723Z-4362be",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180507Z-7da728",
  "org.scalablytyped" %%% "serialize-javascript" % "1.5-dt-20181015Z-cba853",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4d6b96",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-efeb04",
  "org.scalablytyped" %%% "vue" % "2.5.22-9075b7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        