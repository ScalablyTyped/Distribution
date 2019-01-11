organization := "org.scalablytyped"
name := "topojson"
version := "3.2-dt-20180414Z-4bec27"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20180619Z-c15177",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "topojson-client" % "3.0-dt-20180414Z-720cdd",
  "org.scalablytyped" %%% "topojson-simplify" % "3.0-dt-20180414Z-2faafd",
  "org.scalablytyped" %%% "topojson-specification" % "1.0-dt-20180719Z-2ba164")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        