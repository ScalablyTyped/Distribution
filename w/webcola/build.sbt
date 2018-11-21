organization := "com.scalablytyped"
name := "webcola"
version := "3.3.8-455f05"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20180910Z-558b23",
  "com.scalablytyped" %%% "d3-drag" % "1.2-dt-20181116Z-04631a",
  "com.scalablytyped" %%% "d3-selection" % "1.3-dt-20181120Z-74ec8f",
  "com.scalablytyped" %%% "d3-timer" % "1.0-dt-20180918Z-25a8ac",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        