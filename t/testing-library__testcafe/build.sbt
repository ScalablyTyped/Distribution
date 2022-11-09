organization := "org.scalablytyped"
name := "testing-library__testcafe"
version := "4.4.1-e2d4c7"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aria-query" % "5.0-dt-20221027Z-378656",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "pretty-format" % "29.3.1-ebbec4",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "testcafe" % "2.0.1-a8778b",
  "org.scalablytyped" %%% "testing-library__dom" % "8.19.0-bf6b96")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
