organization := "org.scalablytyped"
name := "vega-embed"
version := "6.21.0-e5dad2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-1ed7c2",
  "org.scalablytyped" %%% "fast-json-patch" % "3.1.1-b779b5",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "vega" % "5.22.1-ad563d",
  "org.scalablytyped" %%% "vega-expression" % "5.0.0-bde78a",
  "org.scalablytyped" %%% "vega-lite" % "5.6.0-d3b840",
  "org.scalablytyped" %%% "vega-tooltip" % "0.28.0-f38a31",
  "org.scalablytyped" %%% "vega-typings" % "0.22.3-b3fcb7",
  "org.scalablytyped" %%% "vega-util" % "1.17.0-cfa9db")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
