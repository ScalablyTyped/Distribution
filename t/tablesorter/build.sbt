organization := "org.scalablytyped"
name := "tablesorter"
version := "2.31-dt-20211202Z-7b0a26"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20221103Z-8f152c",
  "org.scalablytyped" %%% "globalize" % "1.5-dt-20211202Z-05be1c",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20221103Z-9a2a4d",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20211202Z-01275a",
  "org.scalablytyped" %%% "select2" % "4.0-dt-20220127Z-e31f31",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-4e4849",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
