organization := "org.scalablytyped"
name := "venn"
version := "0.2.16-dt-20181220Z-354f28"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3" % "5.5-dt-20181216Z-7c5b60",
  "org.scalablytyped" %%% "d3-array" % "1.2-dt-20181015Z-6ecb01",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20180917Z-67c60d",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20181117Z-ff8666",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20181115Z-2adb16",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20180514Z-691c31",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20180520Z-1e7100",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20181031Z-c863ba",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20180807Z-adecc1",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20181117Z-ca9434",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20181115Z-e97e8c",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20180214Z-6cfaa5",
  "org.scalablytyped" %%% "d3-fetch" % "1.1-dt-20181219Z-bcb816",
  "org.scalablytyped" %%% "d3-force" % "1.1-dt-20180514Z-24f88d",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20180510Z-672d77",
  "org.scalablytyped" %%% "d3-geo" % "1.10-dt-20180514Z-53dc58",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20181208Z-6c8bee",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20180917Z-d8efdf",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20180514Z-b7d80f",
  "org.scalablytyped" %%% "d3-polygon" % "1.0-dt-20180507Z-ed81f9",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20180912Z-ce3cb7",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20180514Z-c8bfa1",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20181216Z-5ea1da",
  "org.scalablytyped" %%% "d3-scale-chromatic" % "1.3-dt-20180918Z-0530a8",
  "org.scalablytyped" %%% "d3-selection" % "1.3-dt-20181117Z-95153d",
  "org.scalablytyped" %%% "d3-shape" % "1.2-dt-20181208Z-1a625c",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20180912Z-752cae",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20180214Z-e11fd6",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20180912Z-357484",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20181115Z-aa001d",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20180831Z-5555cd",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20181208Z-c4cdb3",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20180619Z-2c26a8",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        