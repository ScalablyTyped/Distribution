organization := "org.scalablytyped"
name := "vue-loader"
version := "15.6.4-d586b4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-a737ef",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-a09216",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-04358d",
  "org.scalablytyped" %%% "chalk" % "2.4.2-413387",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-048d4d",
  "org.scalablytyped" %%% "consolidate" % "0.0-unknown-dt-20180712Z-80c2b4",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-964066",
  "org.scalablytyped" %%% "hash-sum" % "1.0-dt-20180822Z-0cb154",
  "org.scalablytyped" %%% "js-base64" % "2.3-dt-20180214Z-0003cc",
  "org.scalablytyped" %%% "loader-utils" % "1.1-dt-20180306Z-a2aa92",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-47a544",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190215Z-604ea6",
  "org.scalablytyped" %%% "postcss" % "5.2.18-c422cf",
  "org.scalablytyped" %%% "prettier" % "1.16-dt-20190212Z-01fcb6",
  "org.scalablytyped" %%% "source-map" % "0.7.3-cdf339",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-20da60",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-2fd0f1",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-876284",
  "org.scalablytyped" %%% "vue__component-compiler-utils" % "2.6.0-516148",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190116Z-6c85ea")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        