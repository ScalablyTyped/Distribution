organization := "org.scalablytyped"
name := "wordpress__edit-post"
version := "4.0-dt-20211202Z-51a6db"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "downshift" % "7.0.0-189216",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "re-resizable" % "6.9.9-76a590",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221025Z-ca420a",
  "org.scalablytyped" %%% "react-dom" % "18.0-dt-20221024Z-bf50fa",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "tinycolor2" % "1.4-dt-20211202Z-d3d306",
  "org.scalablytyped" %%% "wordpress__components" % "19.10-dt-20220829Z-bbd1ab",
  "org.scalablytyped" %%% "wordpress__element" % "4.18.0-cd1902",
  "org.scalablytyped" %%% "wordpress__notices" % "3.5-dt-20220601Z-b6c039",
  "org.scalablytyped" %%% "wordpress__rich-text" % "3.4-dt-20211202Z-a279de")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
