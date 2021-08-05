organization := "org.scalablytyped"
name := "vega-embed"
version := "6.13.0-67b0b5"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fast-json-patch" % "3.0.0-1-dabb32",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "vega" % "5.17.0-377a55",
  "org.scalablytyped" %%% "vega-lite" % "4.17.0-f6b45c",
  "org.scalablytyped" %%% "vega-tooltip" % "0.24.2-76aed4",
  "org.scalablytyped" %%% "vega-typings" % "0.19.1-b878d8",
  "org.scalablytyped" %%% "vega-util" % "1.16.0-8a5afa")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
