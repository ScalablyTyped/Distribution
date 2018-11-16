organization := "com.scalablytyped"
name := "vue-loader"
version := "15.4.2-eafcee"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181102Z-d346e3",
  "com.scalablytyped" %%% "anymatch" % "1.3-dt-20181102Z-81c269",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20181102Z-6d07df",
  "com.scalablytyped" %%% "chalk" % "2.4.1-ef8d2c",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20181102Z-8ba882",
  "com.scalablytyped" %%% "consolidate" % "0.0-unknown-dt-20181102Z-ea7de4",
  "com.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20181102Z-6ced09",
  "com.scalablytyped" %%% "hash-sum" % "1.0-dt-20181102Z-98cf9c",
  "com.scalablytyped" %%% "js-base64" % "2.3-dt-20181102Z-dabc5a",
  "com.scalablytyped" %%% "loader-utils" % "1.1-dt-20181102Z-60da85",
  "com.scalablytyped" %%% "lru-cache" % "4.1-dt-20181102Z-59869e",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "postcss" % "5.2.18-cf3c1a",
  "com.scalablytyped" %%% "prettier" % "1.15-dt-20181116Z-7fefbf",
  "com.scalablytyped" %%% "source-map" % "0.7.3-771552",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "supports-color" % "5.3-dt-20181102Z-2c93a8",
  "com.scalablytyped" %%% "tapable" % "v1.0.0-dt-20181102Z-d10221",
  "com.scalablytyped" %%% "uglify-js" % "3.0-dt-20181102Z-f3dae8",
  "com.scalablytyped" %%% "vue__component-compiler-utils" % "2.3.0-618c79",
  "com.scalablytyped" %%% "webpack" % "4.4-dt-20181116Z-80c872",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        