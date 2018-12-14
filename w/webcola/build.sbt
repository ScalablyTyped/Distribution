organization := "org.scalablytyped"
name := "webcola"
version := "3.3.8-a9cf7f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20180910Z-32d274",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20181206Z-e7f5c6",
  "org.scalablytyped" %%% "d3-selection" % "1.3-dt-20181206Z-872689",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20180918Z-f050bd",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        