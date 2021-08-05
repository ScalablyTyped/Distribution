organization := "org.scalablytyped"
name := "theme-ui"
version := "0.3-dt-20200925Z-49063c"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-344a29",
  "org.scalablytyped" %%% "emotion__core" % "10.1.1-c9baa4",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.16-930fda",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.31-1c0db7",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-2a6db3",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-49dd4c",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-76d083",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "styled-system" % "5.1-dt-20201028Z-ce4884",
  "org.scalablytyped" %%% "styled-system__css" % "5.0-dt-20200925Z-2fe48e",
  "org.scalablytyped" %%% "theme-ui__components" % "0.2-dt-20200925Z-cb6c56")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
