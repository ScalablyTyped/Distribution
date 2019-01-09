organization := "org.scalablytyped"
name := "vega"
version := "4.4.0-b37144"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "vega-lib" % "4.4.0-13b52c",
  "org.scalablytyped" %%% "vega-typings" % "0.3.53-2c316d",
  "org.scalablytyped" %%% "vega-util" % "1.7.1-01697d",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20181231Z-a71d52")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        