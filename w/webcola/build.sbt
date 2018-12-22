organization := "org.scalablytyped"
name := "webcola"
version := "3.3.8-a1ddf0"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20180807Z-adecc1",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20181117Z-ca9434",
  "org.scalablytyped" %%% "d3-selection" % "1.3-dt-20181117Z-95153d",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20180912Z-357484",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        