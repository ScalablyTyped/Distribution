organization := "org.scalablytyped"
name := "sw-precache-webpack-plugin"
version := "0.11-dt-20180507Z-94e356"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-e20eff",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "path-to-regexp" % "2.4.0-25c26f",
  "org.scalablytyped" %%% "source-map" % "0.7.3-fc8207",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "sw-precache" % "5.2-dt-20180504Z-1dd0b4",
  "org.scalablytyped" %%% "sw-toolbox" % "3.6.0-8f9948",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-48ad47",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-8b616d",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181221Z-bcc5d7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        