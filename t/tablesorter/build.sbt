organization := "org.scalablytyped"
name := "tablesorter"
version := "2.31-dt-20230328Z-be46d8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20230429Z-e0f70b",
  "org.scalablytyped" %%% "globalize" % "1.5-dt-20211202Z-c66798",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20221231Z-11244e",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20230518Z-379f04",
  "org.scalablytyped" %%% "select2" % "4.0-dt-20230525Z-263267",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-ee1324",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
