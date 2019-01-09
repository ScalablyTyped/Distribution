organization := "org.scalablytyped"
name := "topojson"
version := "3.2-dt-20180414Z-2c09c0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20180619Z-5d845b",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "topojson-client" % "3.0-dt-20180414Z-70b38c",
  "org.scalablytyped" %%% "topojson-simplify" % "3.0-dt-20180414Z-6871c3",
  "org.scalablytyped" %%% "topojson-specification" % "1.0-dt-20180719Z-0a8a03")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        