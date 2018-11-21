organization := "com.scalablytyped"
name := "topojson"
version := "3.2-dt-20180910Z-97693b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "geojson" % "7946.0-dt-20180910Z-60feb0",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "topojson-client" % "3.0-dt-20180910Z-af247f",
  "com.scalablytyped" %%% "topojson-simplify" % "3.0-dt-20180910Z-b892c5",
  "com.scalablytyped" %%% "topojson-specification" % "1.0-dt-20180910Z-719a51",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        