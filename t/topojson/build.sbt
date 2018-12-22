organization := "org.scalablytyped"
name := "topojson"
version := "3.2-dt-20180414Z-263f1b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20180619Z-2c26a8",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "topojson-client" % "3.0-dt-20180414Z-800b9b",
  "org.scalablytyped" %%% "topojson-simplify" % "3.0-dt-20180414Z-24fa61",
  "org.scalablytyped" %%% "topojson-specification" % "1.0-dt-20180719Z-677a8a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        