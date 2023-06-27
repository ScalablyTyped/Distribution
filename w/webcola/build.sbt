organization := "org.scalablytyped"
name := "webcola"
version := "3.4.0-5f2cb3"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-dispatch" % "3.0-dt-20221230Z-282096",
  "org.scalablytyped" %%% "d3-drag" % "3.0-dt-20221230Z-74f6eb",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20230317Z-7766af",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-7b4003",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
