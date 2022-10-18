organization := "org.scalablytyped"
name := "webcola"
version := "3.4.0-3b3f87"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-dispatch" % "3.0-dt-20220624Z-03d3f0",
  "org.scalablytyped" %%% "d3-drag" % "3.0-dt-20211202Z-224d6b",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20220720Z-f7caf7",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-0f32a8",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
