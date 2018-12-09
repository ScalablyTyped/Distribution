organization := "org.scalablytyped"
name := "vue__component-compiler-utils"
version := "2.3.0-cdbe12"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-9d8946",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-98d464",
  "org.scalablytyped" %%% "chalk" % "2.4.1-d31457",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-1e18f5",
  "org.scalablytyped" %%% "consolidate" % "0.0-unknown-dt-20180910Z-324582",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-895ba8",
  "org.scalablytyped" %%% "hash-sum" % "1.0-dt-20180910Z-43a154",
  "org.scalablytyped" %%% "js-base64" % "2.3-dt-20180910Z-6405bc",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180910Z-fa35eb",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "postcss" % "5.2.18-c1a7ed",
  "org.scalablytyped" %%% "prettier" % "1.15-dt-20181128Z-cd99f9",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4f6afc",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-e87018")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        