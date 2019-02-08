organization := "org.scalablytyped"
name := "ts-node"
version := "7.0.1-8ae28c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-b54dd4",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180616Z-2c3fb5",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190129Z-a792d3",
  "org.scalablytyped" %%% "make-error" % "1.3.5-95be7b",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-9fc7e9",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-db0fed",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-9f73ab",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-7473a0",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "typescript" % "3.3.3-7959f4",
  "org.scalablytyped" %%% "yn" % "3.0-dt-20190117Z-ce47fc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        