organization := "org.scalablytyped"
name := "topojson"
version := "3.2-dt-20180414Z-6997e7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190106Z-39aba4",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "topojson-client" % "3.0-dt-20180414Z-143fcf",
  "org.scalablytyped" %%% "topojson-simplify" % "3.0-dt-20180414Z-df9e90",
  "org.scalablytyped" %%% "topojson-specification" % "1.0-dt-20180719Z-4f7547")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        