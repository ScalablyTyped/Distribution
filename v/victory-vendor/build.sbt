organization := "org.scalablytyped"
name := "victory-vendor"
version := "36.6.8-b7e5e7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-array" % "3.0-dt-20220624Z-6e7330",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-20258d",
  "org.scalablytyped" %%% "d3-ease" % "3.0-dt-20211223Z-b88c1a",
  "org.scalablytyped" %%% "d3-interpolate" % "3.0-dt-20220624Z-d7f73c",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-97e717",
  "org.scalablytyped" %%% "d3-scale" % "4.0-dt-20220624Z-bb7662",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20220624Z-2f39ea",
  "org.scalablytyped" %%% "d3-time" % "3.0-dt-20211202Z-94b19b",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-0f32a8",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
