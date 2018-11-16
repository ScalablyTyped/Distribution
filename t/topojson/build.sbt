organization := "com.scalablytyped"
name := "topojson"
version := "3.2-dt-20181102Z-0e5683"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "geojson" % "7946.0-dt-20181102Z-d820c3",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "topojson-client" % "3.0-dt-20181102Z-c2848b",
  "com.scalablytyped" %%% "topojson-simplify" % "3.0-dt-20181102Z-b7d527",
  "com.scalablytyped" %%% "topojson-specification" % "1.0-dt-20181102Z-456553",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        