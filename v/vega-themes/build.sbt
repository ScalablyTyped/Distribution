organization := "org.scalablytyped"
name := "vega-themes"
version := "2.12.0-2ffff6"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-9389e9",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "vega-expression" % "5.0.0-ce26df",
  "org.scalablytyped" %%% "vega-lite" % "5.5.0-9bf782",
  "org.scalablytyped" %%% "vega-typings" % "0.22.3-f04a17",
  "org.scalablytyped" %%% "vega-util" % "1.17.0-37bf06")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
