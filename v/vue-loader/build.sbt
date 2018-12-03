organization := "com.scalablytyped"
name := "vue-loader"
version := "15.4.2-f2529c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-8b01ce",
  "com.scalablytyped" %%% "anymatch" % "1.3-dt-20180910Z-6ee76b",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-7bd99a",
  "com.scalablytyped" %%% "chalk" % "2.4.1-557431",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-20e4ae",
  "com.scalablytyped" %%% "consolidate" % "0.0-unknown-dt-20180910Z-1c3c58",
  "com.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-450016",
  "com.scalablytyped" %%% "hash-sum" % "1.0-dt-20180910Z-f244ed",
  "com.scalablytyped" %%% "js-base64" % "2.3-dt-20180910Z-bc1045",
  "com.scalablytyped" %%% "loader-utils" % "1.1-dt-20180910Z-3f35d2",
  "com.scalablytyped" %%% "lru-cache" % "4.1-dt-20180910Z-8c9e0c",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "postcss" % "5.2.18-f1f08e",
  "com.scalablytyped" %%% "prettier" % "1.15-dt-20181128Z-dec7a2",
  "com.scalablytyped" %%% "source-map" % "0.7.3-ecab3d",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-a10740",
  "com.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180910Z-ddeb4e",
  "com.scalablytyped" %%% "uglify-js" % "3.0-dt-20181018Z-d28d6f",
  "com.scalablytyped" %%% "vue__component-compiler-utils" % "2.3.0-d5174d",
  "com.scalablytyped" %%% "webpack" % "4.4-dt-20181129Z-17ddae",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        