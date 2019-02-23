organization := "org.scalablytyped"
name := "ts-node"
version := "7.0.1-daccf5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-b54dd4",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180616Z-8246b9",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190129Z-a792d3",
  "org.scalablytyped" %%% "make-error" % "1.3.5-95be7b",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-9fc7e9",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-47f2e9",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190215Z-604ea6",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20190212Z-9d6f11",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "typescript" % "3.3.3333-7959f4",
  "org.scalablytyped" %%% "yn" % "3.0-dt-20190117Z-ce47fc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        