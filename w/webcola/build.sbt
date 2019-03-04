organization := "org.scalablytyped"
name := "webcola"
version := "3.3.8-239976"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-f28fd7",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-e2c56b",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-c58eff",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-4323a2",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        