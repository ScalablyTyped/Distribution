organization := "org.scalablytyped"
name := "webcola"
version := "3.3.8-30d291"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20180910Z-68d546",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20181206Z-b8b068",
  "org.scalablytyped" %%% "d3-selection" % "1.3-dt-20181206Z-aaebc1",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20180918Z-f38a23",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        