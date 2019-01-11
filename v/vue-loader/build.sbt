organization := "org.scalablytyped"
name := "vue-loader"
version := "15.5.1-153de8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-b48f67",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-09ec76",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-6bd481",
  "org.scalablytyped" %%% "chalk" % "2.4.2-953bc3",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-528543",
  "org.scalablytyped" %%% "consolidate" % "0.0-unknown-dt-20180712Z-78d5e2",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-86d5f2",
  "org.scalablytyped" %%% "hash-sum" % "1.0-dt-20180822Z-9171bb",
  "org.scalablytyped" %%% "js-base64" % "2.3-dt-20180214Z-3bc44d",
  "org.scalablytyped" %%% "loader-utils" % "1.1-dt-20180306Z-2c8d39",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-038998",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "postcss" % "5.2.18-7445b3",
  "org.scalablytyped" %%% "prettier" % "1.15-dt-20181124Z-1860de",
  "org.scalablytyped" %%% "source-map" % "0.7.3-238ef8",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-f611fa",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-db8d14",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-11a316",
  "org.scalablytyped" %%% "vue__component-compiler-utils" % "2.4.0-fdadaa",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181221Z-689a21")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        