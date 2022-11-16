organization := "org.scalablytyped"
name := "victory-vendor"
version := "36.6.8-e5709b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-array" % "3.0-dt-20220624Z-8e2d87",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-e91a54",
  "org.scalablytyped" %%% "d3-ease" % "3.0-dt-20211223Z-e4e0f4",
  "org.scalablytyped" %%% "d3-interpolate" % "3.0-dt-20220624Z-2ae819",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-1117bb",
  "org.scalablytyped" %%% "d3-scale" % "4.0-dt-20220624Z-4f7309",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20220624Z-0efd25",
  "org.scalablytyped" %%% "d3-time" % "3.0-dt-20211202Z-a50cc0",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-7b4003",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
