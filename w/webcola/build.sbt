organization := "org.scalablytyped"
name := "webcola"
version := "3.4.0-bc0ebc"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-dispatch" % "3.0-dt-20220624Z-dc4aaf",
  "org.scalablytyped" %%% "d3-drag" % "3.0-dt-20211202Z-285790",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20220720Z-606835",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-14b69b",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
