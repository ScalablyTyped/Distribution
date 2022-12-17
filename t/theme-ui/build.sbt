organization := "org.scalablytyped"
name := "theme-ui"
version := "0.15.4-cf3a71"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-4db30e",
  "org.scalablytyped" %%% "emotion__react" % "11.10.5-71a84d",
  "org.scalablytyped" %%% "emotion__serialize" % "1.1.1-32908d",
  "org.scalablytyped" %%% "emotion__utils" % "1.2.0-53afd8",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-8a1cd9",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-cf549b",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-6206c7",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "theme-ui__color-modes" % "0.15.4-8db822",
  "org.scalablytyped" %%% "theme-ui__components" % "0.15.4-3dd18f",
  "org.scalablytyped" %%% "theme-ui__core" % "0.15.4-614ca4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
