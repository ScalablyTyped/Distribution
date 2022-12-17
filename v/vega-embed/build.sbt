organization := "org.scalablytyped"
name := "vega-embed"
version := "6.21.0-fc643b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-1eb2b4",
  "org.scalablytyped" %%% "fast-json-patch" % "3.1.1-bba767",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "vega" % "5.22.1-30e90b",
  "org.scalablytyped" %%% "vega-expression" % "5.0.0-8fffa6",
  "org.scalablytyped" %%% "vega-lite" % "5.6.0-9da243",
  "org.scalablytyped" %%% "vega-tooltip" % "0.28.0-40fb6b",
  "org.scalablytyped" %%% "vega-typings" % "0.22.3-ba2244",
  "org.scalablytyped" %%% "vega-util" % "1.17.0-0a1449")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
