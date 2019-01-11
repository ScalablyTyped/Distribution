organization := "org.scalablytyped"
name := "vega"
version := "4.4.0-f69a89"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "vega-lib" % "4.4.0-e5dc43",
  "org.scalablytyped" %%% "vega-typings" % "0.3.53-00ef07",
  "org.scalablytyped" %%% "vega-util" % "1.7.1-50f72e",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20181231Z-419f3a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        