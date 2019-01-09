organization := "org.scalablytyped"
name := "vue-loader"
version := "15.5.1-036660"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-1b78a1",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-c183c0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-a33d29",
  "org.scalablytyped" %%% "chalk" % "2.4.2-38684c",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-58487f",
  "org.scalablytyped" %%% "consolidate" % "0.0-unknown-dt-20180712Z-abf372",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-ec7424",
  "org.scalablytyped" %%% "hash-sum" % "1.0-dt-20180822Z-0bb8b8",
  "org.scalablytyped" %%% "js-base64" % "2.3-dt-20180214Z-80aedd",
  "org.scalablytyped" %%% "loader-utils" % "1.1-dt-20180306Z-be2a04",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-a950ce",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "postcss" % "5.2.18-20982a",
  "org.scalablytyped" %%% "prettier" % "1.15-dt-20181124Z-752e7c",
  "org.scalablytyped" %%% "source-map" % "0.7.3-8fe344",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-729b1c",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-e50996",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-bd0e3f",
  "org.scalablytyped" %%% "vue__component-compiler-utils" % "2.4.0-55ff99",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181221Z-f6f4be")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        