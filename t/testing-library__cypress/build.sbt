organization := "org.scalablytyped"
name := "testing-library__cypress"
version := "5.0-dt-20211202Z-e2a5c6"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aria-query" % "5.0-dt-20211202Z-0913f2",
  "org.scalablytyped" %%% "buffer" % "6.0.3-6a53bb",
  "org.scalablytyped" %%% "cypress" % "10.10.0-dd16dc",
  "org.scalablytyped" %%% "eventemitter2" % "6.4.9-ca6f16",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "pretty-format" % "29.2.1-4e241c",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-e3da4a",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-a98916",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "testing-library__dom" % "8.19.0-b2e0cb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
