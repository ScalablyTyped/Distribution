organization := "org.scalablytyped"
name := "wordpress__components"
version := "9.8-dt-20201104Z-1c2858"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b8d190",
  "org.scalablytyped" %%% "downshift" % "6.0.6-e0db65",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-a12f9a",
  "org.scalablytyped" %%% "re-resizable" % "6.6.1-f90668",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-c80121",
  "org.scalablytyped" %%% "react-dom" % "17.0-dt-20201120Z-95d384",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "tinycolor2" % "1.4-dt-20201002Z-897719",
  "org.scalablytyped" %%% "wordpress__element" % "2.18.0-b7be65",
  "org.scalablytyped" %%% "wordpress__notices" % "1.5-dt-20200925Z-f1769e",
  "org.scalablytyped" %%% "wordpress__rich-text" % "3.4-dt-20200925Z-90bce6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
