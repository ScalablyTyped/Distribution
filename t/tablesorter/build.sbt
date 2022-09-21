organization := "org.scalablytyped"
name := "tablesorter"
version := "2.31-dt-20211202Z-78362a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20220818Z-c89e1d",
  "org.scalablytyped" %%% "globalize" % "1.5-dt-20211202Z-bad7af",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20220624Z-d9fe7d",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20211202Z-121101",
  "org.scalablytyped" %%% "select2" % "4.0-dt-20220127Z-3cf5f1",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-964e56",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
