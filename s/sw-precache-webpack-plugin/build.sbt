organization := "org.scalablytyped"
name := "sw-precache-webpack-plugin"
version := "0.11-dt-20180910Z-284438"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180910Z-940dc4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "path-to-regexp" % "2.4.0-a79afe",
  "org.scalablytyped" %%% "source-map" % "0.7.3-a4132b",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "sw-precache" % "5.2-dt-20180910Z-4aa0af",
  "org.scalablytyped" %%% "sw-toolbox" % "3.6.0-b1d86a",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180910Z-ea4dd1",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181018Z-d845d1",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181210Z-208f59")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        