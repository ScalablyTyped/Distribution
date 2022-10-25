organization := "org.scalablytyped"
name := "wordpress__media-utils"
version := "3.0-dt-20220421Z-944cff"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "downshift" % "7.0.0-7eb230",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "re-resizable" % "6.9.9-3848cd",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221024Z-9c1cd5",
  "org.scalablytyped" %%% "react-autosize-textarea" % "7.1.0-fadfb6",
  "org.scalablytyped" %%% "react-dom" % "18.0-dt-20221024Z-4d26f6",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "tinycolor2" % "1.4-dt-20211202Z-d3d306",
  "org.scalablytyped" %%% "wordpress__block-editor" % "7.0-dt-20220413Z-a1fb05",
  "org.scalablytyped" %%% "wordpress__blocks" % "11.0-dt-20220815Z-f46d88",
  "org.scalablytyped" %%% "wordpress__components" % "19.10-dt-20220829Z-dd2efb",
  "org.scalablytyped" %%% "wordpress__element" % "4.18.0-f6f5af",
  "org.scalablytyped" %%% "wordpress__notices" % "3.5-dt-20220601Z-25d711",
  "org.scalablytyped" %%% "wordpress__rich-text" % "3.4-dt-20211202Z-c3152f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
