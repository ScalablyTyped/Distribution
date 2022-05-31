organization := "org.scalablytyped"
name := "wordpress__edit-post"
version := "3.5-dt-20200925Z-075179"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-dc2f99",
  "org.scalablytyped" %%% "downshift" % "6.0.6-ad2719",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-3fbed9",
  "org.scalablytyped" %%% "re-resizable" % "6.6.1-aee421",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-4ff700",
  "org.scalablytyped" %%% "react-dom" % "17.0-dt-20201120Z-f7391b",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "tinycolor2" % "1.4-dt-20201002Z-5d42bd",
  "org.scalablytyped" %%% "wordpress__components" % "9.8-dt-20201104Z-4beaf3",
  "org.scalablytyped" %%% "wordpress__element" % "2.18.0-6ec5e6",
  "org.scalablytyped" %%% "wordpress__notices" % "1.5-dt-20200925Z-747800",
  "org.scalablytyped" %%% "wordpress__rich-text" % "3.4-dt-20200925Z-01de37")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
