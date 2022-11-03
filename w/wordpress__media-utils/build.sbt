organization := "org.scalablytyped"
name := "wordpress__media-utils"
version := "3.0-dt-20220421Z-b4af70"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "downshift" % "7.0.1-a60010",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "re-resizable" % "6.9.9-ca96eb",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221027Z-1a0a13",
  "org.scalablytyped" %%% "react-autosize-textarea" % "7.1.0-a781df",
  "org.scalablytyped" %%% "react-dom" % "18.0-dt-20221027Z-34f203",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "tinycolor2" % "1.4-dt-20211202Z-d3d306",
  "org.scalablytyped" %%% "wordpress__block-editor" % "7.0-dt-20220413Z-5b41aa",
  "org.scalablytyped" %%% "wordpress__blocks" % "11.0-dt-20220815Z-ebc4dc",
  "org.scalablytyped" %%% "wordpress__components" % "19.10-dt-20220829Z-014396",
  "org.scalablytyped" %%% "wordpress__element" % "4.19.0-fe3504",
  "org.scalablytyped" %%% "wordpress__notices" % "3.5-dt-20220601Z-e83925",
  "org.scalablytyped" %%% "wordpress__rich-text" % "3.4-dt-20211202Z-63f67e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
