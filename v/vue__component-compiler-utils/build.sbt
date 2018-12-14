organization := "org.scalablytyped"
name := "vue__component-compiler-utils"
version := "2.3.0-e0d137"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-226182",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181214Z-21934a",
  "org.scalablytyped" %%% "chalk" % "2.4.1-c5701d",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-7f8b58",
  "org.scalablytyped" %%% "consolidate" % "0.0-unknown-dt-20180910Z-3d7480",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-ca86dd",
  "org.scalablytyped" %%% "hash-sum" % "1.0-dt-20180910Z-64f7ff",
  "org.scalablytyped" %%% "js-base64" % "2.3-dt-20180910Z-534cae",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180910Z-91487f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "postcss" % "5.2.18-0731aa",
  "org.scalablytyped" %%% "prettier" % "1.15-dt-20181128Z-c66517",
  "org.scalablytyped" %%% "source-map" % "0.7.3-a4132b",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-7348e2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        