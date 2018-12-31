organization := "org.scalablytyped"
name := "webcola"
version := "3.3.8-041f5c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20180807Z-7b55e5",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20181117Z-42f009",
  "org.scalablytyped" %%% "d3-selection" % "1.3-dt-20181117Z-204a2e",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20180912Z-01d45d",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        