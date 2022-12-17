organization := "org.scalablytyped"
name := "wordpress__edit-post"
version := "4.0-dt-20211202Z-93715f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-4db30e",
  "org.scalablytyped" %%% "downshift" % "7.0.1-14cdd0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-8a1cd9",
  "org.scalablytyped" %%% "re-resizable" % "6.9.9-6cf62f",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-cf549b",
  "org.scalablytyped" %%% "react-dom" % "18.0-dt-20221114Z-e55fa5",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-6206c7",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "tinycolor2" % "1.4-dt-20211202Z-cbda17",
  "org.scalablytyped" %%% "wordpress__components" % "19.10-dt-20220829Z-b36235",
  "org.scalablytyped" %%% "wordpress__element" % "4.19.0-153f25",
  "org.scalablytyped" %%% "wordpress__notices" % "3.5-dt-20220601Z-e0b064",
  "org.scalablytyped" %%% "wordpress__rich-text" % "3.4-dt-20211202Z-5de4ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
