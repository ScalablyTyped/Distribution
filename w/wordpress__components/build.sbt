organization := "org.scalablytyped"
name := "wordpress__components"
version := "19.10-dt-20220829Z-00f1d4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-ab3df7",
  "org.scalablytyped" %%% "downshift" % "7.0.1-9ec13d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-53873f",
  "org.scalablytyped" %%% "re-resizable" % "6.9.9-7f0f4e",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-9ff1b2",
  "org.scalablytyped" %%% "react-dom" % "18.0-dt-20221114Z-6bbe70",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-ea4558",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "tinycolor2" % "1.4-dt-20211202Z-a8c68b",
  "org.scalablytyped" %%% "wordpress__element" % "4.19.0-f295d0",
  "org.scalablytyped" %%% "wordpress__notices" % "3.5-dt-20220601Z-041216",
  "org.scalablytyped" %%% "wordpress__rich-text" % "3.4-dt-20211202Z-ccf15a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
