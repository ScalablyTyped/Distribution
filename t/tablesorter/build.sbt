organization := "org.scalablytyped"
name := "tablesorter"
version := "2.31-dt-20211202Z-196ab1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20221103Z-d46be0",
  "org.scalablytyped" %%% "globalize" % "1.5-dt-20211202Z-efcf9e",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20221103Z-b865bf",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20211202Z-d3f8bc",
  "org.scalablytyped" %%% "select2" % "4.0-dt-20220127Z-63132e",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-d89e1b",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
