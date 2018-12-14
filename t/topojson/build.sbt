organization := "org.scalablytyped"
name := "topojson"
version := "3.2-dt-20180910Z-b63a97"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20180910Z-413c9e",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "topojson-client" % "3.0-dt-20180910Z-b957c6",
  "org.scalablytyped" %%% "topojson-simplify" % "3.0-dt-20180910Z-87a3a9",
  "org.scalablytyped" %%% "topojson-specification" % "1.0-dt-20180910Z-6f7159")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        