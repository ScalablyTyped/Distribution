organization := "org.scalablytyped"
name := "wordpress__components"
version := "23.0-dt-20230327Z-7cec25"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.2-5927f3",
  "org.scalablytyped" %%% "downshift" % "7.6.0-974ceb",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4446ee",
  "org.scalablytyped" %%% "re-resizable" % "6.9.9-17fe92",
  "org.scalablytyped" %%% "react" % "18.2-dt-20230506Z-14ab9d",
  "org.scalablytyped" %%% "react-dom" % "18.2-dt-20230505Z-9874d1",
  "org.scalablytyped" %%% "redux" % "4.2.1-49dd26",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20230322Z-da1b40",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "tinycolor2" % "1.4-dt-20211202Z-d6b3c2",
  "org.scalablytyped" %%% "wordpress__data" % "9.3.0-d5fb78",
  "org.scalablytyped" %%% "wordpress__element" % "5.10.0-daa4f0",
  "org.scalablytyped" %%% "wordpress__notices" % "3.27-dt-20230323Z-cfb245")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
