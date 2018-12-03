organization := "com.scalablytyped"
name := "vue__component-compiler-utils"
version := "2.3.0-d5174d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-8b01ce",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-7bd99a",
  "com.scalablytyped" %%% "chalk" % "2.4.1-557431",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-20e4ae",
  "com.scalablytyped" %%% "consolidate" % "0.0-unknown-dt-20180910Z-1c3c58",
  "com.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-450016",
  "com.scalablytyped" %%% "hash-sum" % "1.0-dt-20180910Z-f244ed",
  "com.scalablytyped" %%% "js-base64" % "2.3-dt-20180910Z-bc1045",
  "com.scalablytyped" %%% "lru-cache" % "4.1-dt-20180910Z-8c9e0c",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "postcss" % "5.2.18-f1f08e",
  "com.scalablytyped" %%% "prettier" % "1.15-dt-20181128Z-dec7a2",
  "com.scalablytyped" %%% "source-map" % "0.7.3-ecab3d",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-a10740",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        