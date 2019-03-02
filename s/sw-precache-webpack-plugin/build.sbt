organization := "org.scalablytyped"
name := "sw-precache-webpack-plugin"
version := "0.11-dt-20180507Z-fe86e4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-ffeb0a",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "path-to-regexp" % "3.0.0-1c82be",
  "org.scalablytyped" %%% "source-map" % "0.7.3-52dc03",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "sw-precache" % "5.2-dt-20180504Z-7bd9ab",
  "org.scalablytyped" %%% "sw-toolbox" % "3.6.0-9c7ed4",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-4cd4ea",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-ba58e2",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190222Z-5cab92")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        