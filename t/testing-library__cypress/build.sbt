organization := "org.scalablytyped"
name := "testing-library__cypress"
version := "5.0-dt-20230413Z-599ded"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aria-query" % "5.0-dt-20221027Z-94ebf8",
  "org.scalablytyped" %%% "buffer" % "6.0.3-acbfae",
  "org.scalablytyped" %%% "cypress" % "12.12.0-afdc7b",
  "org.scalablytyped" %%% "eventemitter2" % "6.4.9-a4982c",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "pretty-format" % "29.5.0-e0482b",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-bc3c2e",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-227892",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "testing-library__dom" % "9.3.0-8987e1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
