organization := "org.scalablytyped"
name := "topojson"
version := "3.2-dt-20180910Z-06bd5a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20180910Z-04a914",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "topojson-client" % "3.0-dt-20180910Z-b69d92",
  "org.scalablytyped" %%% "topojson-simplify" % "3.0-dt-20180910Z-569986",
  "org.scalablytyped" %%% "topojson-specification" % "1.0-dt-20180910Z-51464c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        