organization := "org.scalablytyped"
name := "vega-themes"
version := "2.13.0-b49225"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20230419Z-f51b02",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-852eb7",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "vega-expression" % "5.1.0-b706ac",
  "org.scalablytyped" %%% "vega-lite" % "5.9.0-101ae8",
  "org.scalablytyped" %%% "vega-typings" % "0.24.1-083a35",
  "org.scalablytyped" %%% "vega-util" % "1.17.2-d32680")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
