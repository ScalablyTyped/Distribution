organization := "org.scalablytyped"
name := "wordpress__block-editor"
version := "7.0-dt-20220413Z-410030"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9b270c",
  "org.scalablytyped" %%% "downshift" % "7.0.1-f4fe50",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-9c1d48",
  "org.scalablytyped" %%% "re-resizable" % "6.9.9-ffe687",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-c1aa2f",
  "org.scalablytyped" %%% "react-autosize-textarea" % "7.1.0-9fbbfd",
  "org.scalablytyped" %%% "react-dom" % "18.0-dt-20221114Z-dfc723",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fd69ea",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "tinycolor2" % "1.4-dt-20211202Z-013259",
  "org.scalablytyped" %%% "wordpress__blocks" % "11.0-dt-20221114Z-2c4777",
  "org.scalablytyped" %%% "wordpress__components" % "19.10-dt-20220829Z-71f8be",
  "org.scalablytyped" %%% "wordpress__element" % "4.19.0-938b4b",
  "org.scalablytyped" %%% "wordpress__notices" % "3.5-dt-20220601Z-7beb7e",
  "org.scalablytyped" %%% "wordpress__rich-text" % "3.4-dt-20211202Z-ab0fd2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
