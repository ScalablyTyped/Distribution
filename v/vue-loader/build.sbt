organization := "com.scalablytyped"
name := "vue-loader"
version := "15.4.2-23f9ba"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-16b038",
  "com.scalablytyped" %%% "anymatch" % "1.3-dt-20180910Z-335bc8",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-3124ce",
  "com.scalablytyped" %%% "chalk" % "2.4.1-ea2afe",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-566c3e",
  "com.scalablytyped" %%% "consolidate" % "0.0-unknown-dt-20180910Z-d7af42",
  "com.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-76e9e4",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "hash-sum" % "1.0-dt-20180910Z-91a12e",
  "com.scalablytyped" %%% "js-base64" % "2.3-dt-20180910Z-b4a065",
  "com.scalablytyped" %%% "loader-utils" % "1.1-dt-20180910Z-a707c6",
  "com.scalablytyped" %%% "lru-cache" % "4.1-dt-20180910Z-02fd9c",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "postcss" % "5.2.18-7d3203",
  "com.scalablytyped" %%% "prettier" % "1.15-dt-20181120Z-de5610",
  "com.scalablytyped" %%% "source-map" % "0.7.3-2a06d1",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-f11a37",
  "com.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180910Z-aab6b2",
  "com.scalablytyped" %%% "uglify-js" % "3.0-dt-20181018Z-3bc20d",
  "com.scalablytyped" %%% "vue__component-compiler-utils" % "2.2.0-2d41d0",
  "com.scalablytyped" %%% "webpack" % "4.4-dt-20181116Z-1b7f4c",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        