organization := "org.scalablytyped"
name := "vega-embed"
version := "6.21.0-0c774e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-9389e9",
  "org.scalablytyped" %%% "fast-json-patch" % "3.1.1-35512a",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "vega" % "5.22.1-94e7b5",
  "org.scalablytyped" %%% "vega-expression" % "5.0.0-ce26df",
  "org.scalablytyped" %%% "vega-lite" % "5.5.0-9bf782",
  "org.scalablytyped" %%% "vega-tooltip" % "0.28.0-ff192c",
  "org.scalablytyped" %%% "vega-typings" % "0.22.3-f04a17",
  "org.scalablytyped" %%% "vega-util" % "1.17.0-37bf06")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
