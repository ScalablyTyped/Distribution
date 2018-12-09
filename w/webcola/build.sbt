organization := "org.scalablytyped"
name := "webcola"
version := "3.3.8-00e155"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20180910Z-a7d850",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20181206Z-b5b602",
  "org.scalablytyped" %%% "d3-selection" % "1.3-dt-20181206Z-560b20",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20180918Z-801ca7",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        