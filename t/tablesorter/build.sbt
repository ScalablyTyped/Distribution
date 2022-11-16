organization := "org.scalablytyped"
name := "tablesorter"
version := "2.31-dt-20211202Z-e13641"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20221103Z-2e2234",
  "org.scalablytyped" %%% "globalize" % "1.5-dt-20211202Z-650810",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20221103Z-20efda",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20211202Z-cec445",
  "org.scalablytyped" %%% "select2" % "4.0-dt-20220127Z-c25130",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-224716",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
