organization := "org.scalablytyped"
name := "wordpress__blocks"
version := "11.0-dt-20220815Z-8d28aa"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-f779a1",
  "org.scalablytyped" %%% "downshift" % "7.0.1-433cd1",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-fada11",
  "org.scalablytyped" %%% "re-resizable" % "6.9.9-7a1c80",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-fab591",
  "org.scalablytyped" %%% "react-dom" % "18.0-dt-20221027Z-a5427b",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-08aa87",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "tinycolor2" % "1.4-dt-20211202Z-b10766",
  "org.scalablytyped" %%% "wordpress__components" % "19.10-dt-20220829Z-72ffd6",
  "org.scalablytyped" %%% "wordpress__element" % "4.19.0-b2f5da",
  "org.scalablytyped" %%% "wordpress__notices" % "3.5-dt-20220601Z-61d158",
  "org.scalablytyped" %%% "wordpress__rich-text" % "3.4-dt-20211202Z-679fe4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
