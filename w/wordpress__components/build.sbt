organization := "org.scalablytyped"
name := "wordpress__components"
version := "19.10-dt-20220829Z-a41f1e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-0912f8",
  "org.scalablytyped" %%% "downshift" % "6.1.12-87ad0c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-975e63",
  "org.scalablytyped" %%% "re-resizable" % "6.9.9-a6a515",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-fc8273",
  "org.scalablytyped" %%% "react-dom" % "18.0-dt-20220819Z-09251e",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-3fbb8c",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "tinycolor2" % "1.4-dt-20211202Z-4efd87",
  "org.scalablytyped" %%% "wordpress__element" % "4.16.0-a49d5b",
  "org.scalablytyped" %%% "wordpress__notices" % "3.5-dt-20220601Z-076368",
  "org.scalablytyped" %%% "wordpress__rich-text" % "3.4-dt-20211202Z-cabd49")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
