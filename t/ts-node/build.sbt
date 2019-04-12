organization := "org.scalablytyped"
name := "ts-node"
version := "7.0.1-07d014"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "2.0.1-d2905f",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180616Z-9d3070",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190322Z-05edd1",
  "org.scalablytyped" %%% "make-error" % "1.3.5-57f61f",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-8cca44",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-1134d6",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "source-map-support" % "0.5-dt-20190224Z-d9dc5d",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "typescript" % "3.4.3-a42773",
  "org.scalablytyped" %%% "yn" % "3.1.0-e397fa")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        