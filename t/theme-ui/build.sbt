organization := "org.scalablytyped"
name := "theme-ui"
version := "0.15.3-4bbcf2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "emotion__react" % "11.10.4-f5f6d5",
  "org.scalablytyped" %%% "emotion__serialize" % "1.1.0-73f928",
  "org.scalablytyped" %%% "emotion__utils" % "1.2.0-86e76d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221025Z-ca420a",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "theme-ui__color-modes" % "0.15.3-00caba",
  "org.scalablytyped" %%% "theme-ui__components" % "0.15.3-2118ca",
  "org.scalablytyped" %%% "theme-ui__core" % "0.15.3-22a3fc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
