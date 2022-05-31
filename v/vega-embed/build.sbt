organization := "org.scalablytyped"
name := "vega-embed"
version := "6.13.0-b8d6fb"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fast-json-patch" % "3.0.0-1-7d47da",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "vega" % "5.17.0-0f58ed",
  "org.scalablytyped" %%% "vega-lite" % "4.17.0-e25c01",
  "org.scalablytyped" %%% "vega-tooltip" % "0.24.2-a2c0d2",
  "org.scalablytyped" %%% "vega-typings" % "0.19.1-2eb7f1",
  "org.scalablytyped" %%% "vega-util" % "1.16.0-a9c3cc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
