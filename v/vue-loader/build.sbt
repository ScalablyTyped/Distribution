organization := "org.scalablytyped"
name := "vue-loader"
version := "15.4.2-3366d8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-ed6428",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180910Z-3370a7",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-b88fdf",
  "org.scalablytyped" %%% "chalk" % "2.4.1-76fe8f",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-f388aa",
  "org.scalablytyped" %%% "consolidate" % "0.0-unknown-dt-20180910Z-0d8a4f",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-404a30",
  "org.scalablytyped" %%% "hash-sum" % "1.0-dt-20180910Z-cdf272",
  "org.scalablytyped" %%% "js-base64" % "2.3-dt-20180910Z-95a564",
  "org.scalablytyped" %%% "loader-utils" % "1.1-dt-20180910Z-e41fe7",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180910Z-9f29f5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "postcss" % "5.2.18-4adc80",
  "org.scalablytyped" %%% "prettier" % "1.15-dt-20181128Z-9c30cd",
  "org.scalablytyped" %%% "source-map" % "0.7.3-6ade85",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-d7a900",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180910Z-a6cca8",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181018Z-3c1589",
  "org.scalablytyped" %%% "vue__component-compiler-utils" % "2.3.0-1c5bf0",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181210Z-1c8cd5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        