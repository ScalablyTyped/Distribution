organization := "org.scalablytyped"
name := "vega-embed"
version := "6.13.0-2ce1ce"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fast-json-patch" % "3.0.0-1-41186c",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "vega" % "5.17.0-660ab6",
  "org.scalablytyped" %%% "vega-lite" % "4.17.0-600005",
  "org.scalablytyped" %%% "vega-tooltip" % "0.24.2-327c09",
  "org.scalablytyped" %%% "vega-typings" % "0.19.1-430c9d",
  "org.scalablytyped" %%% "vega-util" % "1.16.0-2f5e5d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
