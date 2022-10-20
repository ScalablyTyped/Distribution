organization := "org.scalablytyped"
name := "wordpress__edit-post"
version := "4.0-dt-20211202Z-425343"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-775404",
  "org.scalablytyped" %%% "downshift" % "6.1.12-4cfdb0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4c7983",
  "org.scalablytyped" %%% "re-resizable" % "6.9.9-1a47ff",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-bacd1f",
  "org.scalablytyped" %%% "react-dom" % "18.0-dt-20220819Z-73fb03",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-400bee",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "tinycolor2" % "1.4-dt-20211202Z-14cbf1",
  "org.scalablytyped" %%% "wordpress__components" % "19.10-dt-20220829Z-57b1f7",
  "org.scalablytyped" %%% "wordpress__element" % "4.18.0-5df682",
  "org.scalablytyped" %%% "wordpress__notices" % "3.5-dt-20220601Z-e92242",
  "org.scalablytyped" %%% "wordpress__rich-text" % "3.4-dt-20211202Z-d87734")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
