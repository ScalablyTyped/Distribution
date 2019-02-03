organization := "org.scalablytyped"
name := "vega"
version := "4.4.0-d80e94"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "vega-lib" % "4.4.0-566a28",
  "org.scalablytyped" %%% "vega-typings" % "0.3.53-d7da00",
  "org.scalablytyped" %%% "vega-util" % "1.7.1-8b46c3",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20190124Z-31d9dc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        