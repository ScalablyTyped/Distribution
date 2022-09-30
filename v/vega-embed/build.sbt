organization := "org.scalablytyped"
name := "vega-embed"
version := "6.21.0-a62cad"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-e2199b",
  "org.scalablytyped" %%% "fast-json-patch" % "3.1.1-5cd847",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "vega" % "5.22.1-1144d5",
  "org.scalablytyped" %%% "vega-expression" % "5.0.0-4460c0",
  "org.scalablytyped" %%% "vega-lite" % "5.5.0-8179bf",
  "org.scalablytyped" %%% "vega-tooltip" % "0.28.0-dbe657",
  "org.scalablytyped" %%% "vega-typings" % "0.22.3-51cc51",
  "org.scalablytyped" %%% "vega-util" % "1.17.0-8e57c4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
