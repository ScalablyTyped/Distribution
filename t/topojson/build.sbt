organization := "org.scalablytyped"
name := "topojson"
version := "3.2-dt-20190325Z-7b9c74"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-acd4df",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "topojson-client" % "3.0-dt-20180414Z-7ded93",
  "org.scalablytyped" %%% "topojson-server" % "3.0-dt-20190325Z-0b8ff0",
  "org.scalablytyped" %%% "topojson-simplify" % "3.0-dt-20180414Z-22c846",
  "org.scalablytyped" %%% "topojson-specification" % "1.0-dt-20190213Z-d2c890")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        