organization := "org.scalablytyped"
name := "ts-node"
version := "7.0.1-13ab1d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-041603",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180616Z-2ce84c",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181102Z-47e6cf",
  "org.scalablytyped" %%% "make-error" % "1.3.5-40680a",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-54b1d3",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-6a0247",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-5b8a80",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "typescript" % "3.2.2-aeda64")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        