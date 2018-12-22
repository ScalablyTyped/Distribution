organization := "org.scalablytyped"
name := "ts-node"
version := "7.0.1-634001"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-68d6da",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180616Z-5d3527",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181102Z-2cb213",
  "org.scalablytyped" %%% "make-error" % "1.3.5-2ccfc8",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-077fe7",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-524f53",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-a75495",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "typescript" % "3.2.2-c77b02")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        