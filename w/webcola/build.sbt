organization := "org.scalablytyped"
name := "webcola"
version := "3.3.8-3ac882"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20180807Z-a99191",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20181117Z-3ac618",
  "org.scalablytyped" %%% "d3-selection" % "1.3-dt-20181117Z-d2359f",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20180912Z-49512d",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        