organization := "org.scalablytyped"
name := "topojson"
version := "3.2-dt-20180910Z-4f3938"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20180910Z-881ff5",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "topojson-client" % "3.0-dt-20180910Z-d871b9",
  "org.scalablytyped" %%% "topojson-simplify" % "3.0-dt-20180910Z-23ed56",
  "org.scalablytyped" %%% "topojson-specification" % "1.0-dt-20180910Z-eabd74")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        