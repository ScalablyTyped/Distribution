organization := "org.scalablytyped"
name := "vega-tooltip"
version := "0.28.0-40b9f4"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-bee5c7",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "vega-expression" % "5.0.0-b0e6d9",
  "org.scalablytyped" %%% "vega-typings" % "0.22.3-2fed17",
  "org.scalablytyped" %%% "vega-util" % "1.17.0-6a7b83")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
