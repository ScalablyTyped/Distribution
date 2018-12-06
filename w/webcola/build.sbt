organization := "com.scalablytyped"
name := "webcola"
version := "3.3.8-b968d6"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20180910Z-e70716",
  "com.scalablytyped" %%% "d3-drag" % "1.2-dt-20181206Z-eeb7d9",
  "com.scalablytyped" %%% "d3-selection" % "1.3-dt-20181206Z-ca857a",
  "com.scalablytyped" %%% "d3-timer" % "1.0-dt-20180918Z-07e012",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        