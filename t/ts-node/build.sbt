organization := "org.scalablytyped"
name := "ts-node"
version := "7.0.1-9ba171"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-4a3327",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180616Z-be4651",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190322Z-63b240",
  "org.scalablytyped" %%% "make-error" % "1.3.5-28cf5f",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-2ad77d",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-727fc1",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "source-map-support" % "0.5-dt-20190224Z-7c13c5",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "typescript" % "3.3.4000-bb3585",
  "org.scalablytyped" %%% "yn" % "3.0-dt-20190117Z-73ba76")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        