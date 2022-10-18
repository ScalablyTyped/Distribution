organization := "org.scalablytyped"
name := "tablesorter"
version := "2.31-dt-20211202Z-612e60"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20220818Z-70b502",
  "org.scalablytyped" %%% "globalize" % "1.5-dt-20211202Z-d5944f",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20220624Z-8d8789",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20211202Z-cf1e23",
  "org.scalablytyped" %%% "select2" % "4.0-dt-20220127Z-be5ed9",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-a98916",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
