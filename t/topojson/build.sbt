organization := "com.scalablytyped"
name := "topojson"
version := "3.2-dt-20180910Z-53d8aa"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "geojson" % "7946.0-dt-20180910Z-76d217",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "topojson-client" % "3.0-dt-20180910Z-cc4510",
  "com.scalablytyped" %%% "topojson-simplify" % "3.0-dt-20180910Z-69c684",
  "com.scalablytyped" %%% "topojson-specification" % "1.0-dt-20180910Z-cdbd59",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        