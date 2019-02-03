organization := "org.scalablytyped"
name := "topojson"
version := "3.2-dt-20180414Z-15ec10"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190106Z-038c51",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "topojson-client" % "3.0-dt-20180414Z-6b78e0",
  "org.scalablytyped" %%% "topojson-simplify" % "3.0-dt-20180414Z-052a71",
  "org.scalablytyped" %%% "topojson-specification" % "1.0-dt-20180719Z-32877f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        