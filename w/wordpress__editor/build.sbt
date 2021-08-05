organization := "org.scalablytyped"
name := "wordpress__editor"
version := "9.4-dt-20200925Z-f4591a"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-344a29",
  "org.scalablytyped" %%% "downshift" % "6.0.6-8dc1ae",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-49dd4c",
  "org.scalablytyped" %%% "re-resizable" % "6.6.1-1d135a",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-76d083",
  "org.scalablytyped" %%% "react-autosize-textarea" % "7.1.0-8464ac",
  "org.scalablytyped" %%% "react-dom" % "17.0-dt-20201120Z-add176",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "tinycolor2" % "1.4-dt-20201002Z-6e3f6e",
  "org.scalablytyped" %%% "wordpress__api-fetch" % "3.2-dt-20200925Z-e9fa36",
  "org.scalablytyped" %%% "wordpress__block-editor" % "2.2-dt-20200925Z-55ea8a",
  "org.scalablytyped" %%% "wordpress__blocks" % "6.4-dt-20201013Z-fa5d30",
  "org.scalablytyped" %%% "wordpress__components" % "9.8-dt-20201104Z-010b21",
  "org.scalablytyped" %%% "wordpress__core-data" % "2.4-dt-20200925Z-754b49",
  "org.scalablytyped" %%% "wordpress__element" % "2.18.0-9a3328",
  "org.scalablytyped" %%% "wordpress__media-utils" % "0.2-dt-20200925Z-b10fb6",
  "org.scalablytyped" %%% "wordpress__notices" % "1.5-dt-20200925Z-b3fb5d",
  "org.scalablytyped" %%% "wordpress__rich-text" % "3.4-dt-20200925Z-0feed2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
