organization := "com.scalablytyped"
name := "webcola"
version := "3.3.8-cd2b01"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20181102Z-fef271",
  "com.scalablytyped" %%% "d3-drag" % "1.2-dt-20181116Z-405040",
  "com.scalablytyped" %%% "d3-selection" % "1.3-dt-20181116Z-65931c",
  "com.scalablytyped" %%% "d3-timer" % "1.0-dt-20181102Z-aa7ed1",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        