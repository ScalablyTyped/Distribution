organization := "org.scalablytyped"
name := "vega"
version := "4.4.0-e22b18"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "vega-lib" % "4.4.0-9bfaf1",
  "org.scalablytyped" %%% "vega-typings" % "0.3.53-25055c",
  "org.scalablytyped" %%% "vega-util" % "1.7.1-b6435f",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20190124Z-edd14a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        