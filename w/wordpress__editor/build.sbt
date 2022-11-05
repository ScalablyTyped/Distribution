organization := "org.scalablytyped"
name := "wordpress__editor"
version := "11.0-dt-20220407Z-073d7b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "downshift" % "7.0.1-205f25",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "re-resizable" % "6.9.9-871580",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-e64588",
  "org.scalablytyped" %%% "react-autosize-textarea" % "7.1.0-ddb2ae",
  "org.scalablytyped" %%% "react-dom" % "18.0-dt-20221027Z-c00a6f",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "tinycolor2" % "1.4-dt-20211202Z-d3d306",
  "org.scalablytyped" %%% "wordpress__block-editor" % "7.0-dt-20220413Z-ef928c",
  "org.scalablytyped" %%% "wordpress__blocks" % "11.0-dt-20220815Z-d17ddf",
  "org.scalablytyped" %%% "wordpress__components" % "19.10-dt-20220829Z-367c25",
  "org.scalablytyped" %%% "wordpress__core-data" % "2.4-dt-20211202Z-21301b",
  "org.scalablytyped" %%% "wordpress__element" % "4.19.0-e8c2de",
  "org.scalablytyped" %%% "wordpress__media-utils" % "3.0-dt-20220421Z-e96896",
  "org.scalablytyped" %%% "wordpress__notices" % "3.5-dt-20220601Z-0b9656",
  "org.scalablytyped" %%% "wordpress__rich-text" % "3.4-dt-20211202Z-16c059")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
