organization := "org.scalablytyped"
name := "theme-ui__components"
version := "0.2-dt-20200925Z-8d573e"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-dc2f99",
  "org.scalablytyped" %%% "emotion__core" % "10.1.1-65bf16",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.16-b57f85",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.31-b03afc",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-2561dd",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-3fbed9",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-4ff700",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "styled-system" % "5.1-dt-20201028Z-fc40a1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
