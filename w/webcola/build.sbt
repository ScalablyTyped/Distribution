organization := "org.scalablytyped"
name := "webcola"
version := "3.3.9-e6346c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-cc7277",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-6b2123",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-7ad803",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-598a41",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        