organization := "org.scalablytyped"
name := "vega-embed"
version := "6.21.0-6ac87f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-bee5c7",
  "org.scalablytyped" %%% "fast-json-patch" % "3.1.1-6f4a93",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "vega" % "5.22.1-b8bf4f",
  "org.scalablytyped" %%% "vega-expression" % "5.0.0-b0e6d9",
  "org.scalablytyped" %%% "vega-lite" % "5.5.0-219895",
  "org.scalablytyped" %%% "vega-tooltip" % "0.28.0-40b9f4",
  "org.scalablytyped" %%% "vega-typings" % "0.22.3-2fed17",
  "org.scalablytyped" %%% "vega-util" % "1.17.0-6a7b83")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
