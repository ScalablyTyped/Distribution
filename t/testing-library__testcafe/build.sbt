organization := "org.scalablytyped"
name := "testing-library__testcafe"
version := "4.4.1-85f69d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aria-query" % "5.0-dt-20211202Z-0913f2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "pretty-format" % "29.2.1-4e241c",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "testcafe" % "2.0.1-b7ceee",
  "org.scalablytyped" %%% "testing-library__dom" % "8.19.0-b2e0cb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
