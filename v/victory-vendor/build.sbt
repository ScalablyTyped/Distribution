organization := "org.scalablytyped"
name := "victory-vendor"
version := "36.6.8-a86317"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-array" % "3.0-dt-20220624Z-39c0e7",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-9208ca",
  "org.scalablytyped" %%% "d3-ease" % "3.0-dt-20211223Z-5975ea",
  "org.scalablytyped" %%% "d3-interpolate" % "3.0-dt-20220624Z-32d263",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-d2c2a8",
  "org.scalablytyped" %%% "d3-scale" % "4.0-dt-20220624Z-729417",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20220624Z-f5f0fe",
  "org.scalablytyped" %%% "d3-time" % "3.0-dt-20211202Z-7d17be",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-14b69b",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
