organization := "org.scalablytyped"
name := "webcola"
version := "3.3.8-710bd6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20180807Z-430dd5",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20181117Z-225ed1",
  "org.scalablytyped" %%% "d3-selection" % "1.3-dt-20181117Z-37a164",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20180912Z-7cb093",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        