organization := "org.scalablytyped"
name := "vega"
version := "4.4.0-59056d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "vega-lib" % "4.4.0-eafd26",
  "org.scalablytyped" %%% "vega-typings" % "0.3.53-f59e23",
  "org.scalablytyped" %%% "vega-util" % "1.7.1-dff196",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20181231Z-e28795")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        