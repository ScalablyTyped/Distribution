organization := "org.scalablytyped"
name := "webcola"
version := "3.3.8-60bdc8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20180910Z-125972",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20181206Z-8a3e5d",
  "org.scalablytyped" %%% "d3-selection" % "1.3-dt-20181206Z-94ec66",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20180918Z-cb4085",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        