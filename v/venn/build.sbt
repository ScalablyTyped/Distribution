organization := "org.scalablytyped"
name := "venn"
version := "0.2.16-dt-20190326Z-777d52"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3" % "5.7-dt-20190212Z-7da05f",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20190221Z-feb193",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-52ed15",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-000fff",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-31c0fa",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-fa2cdb",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-8ede05",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-5ba94c",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-1525c0",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-a25288",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190326Z-6cf8bf",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20190212Z-f193f1",
  "org.scalablytyped" %%% "d3-fetch" % "1.1-dt-20181228Z-647b1c",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-90bd83",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-7117ae",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-f8a5f2",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-ce6a13",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-bc1efa",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-38121a",
  "org.scalablytyped" %%% "d3-polygon" % "1.0-dt-20190212Z-25e1c3",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-991458",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-7bf407",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-825ab7",
  "org.scalablytyped" %%% "d3-scale-chromatic" % "1.3-dt-20190212Z-7cc38f",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-ed2bfd",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-a59bb2",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-d8b54d",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-ec0764",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-b31229",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-986145",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-d43594",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-1e8841",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-0f225d",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        