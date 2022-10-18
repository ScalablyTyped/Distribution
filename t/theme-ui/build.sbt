organization := "org.scalablytyped"
name := "theme-ui"
version := "0.15.3-08fdc5"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-775404",
  "org.scalablytyped" %%% "emotion__react" % "11.10.4-a4b0aa",
  "org.scalablytyped" %%% "emotion__serialize" % "1.1.0-a24573",
  "org.scalablytyped" %%% "emotion__utils" % "1.2.0-48b99a",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4c7983",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-bacd1f",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-400bee",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "theme-ui__color-modes" % "0.15.3-7f740b",
  "org.scalablytyped" %%% "theme-ui__components" % "0.15.3-43af2c",
  "org.scalablytyped" %%% "theme-ui__core" % "0.15.3-ca7233")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
