organization := "org.scalablytyped"
name := "victory-vendor"
version := "36.6.11-6dd2d5"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-array" % "3.0-dt-20230525Z-061fb1",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-9ae1d2",
  "org.scalablytyped" %%% "d3-ease" % "3.0-dt-20211223Z-e4e0f4",
  "org.scalablytyped" %%% "d3-interpolate" % "3.0-dt-20221230Z-fb2f27",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-1117bb",
  "org.scalablytyped" %%% "d3-scale" % "4.0-dt-20230525Z-aa0fec",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20221230Z-dd436f",
  "org.scalablytyped" %%% "d3-time" % "3.0-dt-20211202Z-107330",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-7b4003",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
