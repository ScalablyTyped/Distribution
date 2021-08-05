organization := "org.scalablytyped"
name := "tablesorter"
version := "2.31-dt-20200515Z-b7566e"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20200923Z-757caa",
  "org.scalablytyped" %%% "globalize" % "1.5-dt-20201002Z-4dcdbd",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20201028Z-87319b",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20201002Z-7c410a",
  "org.scalablytyped" %%% "select2" % "4.0-dt-20201020Z-ffdaeb",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20201002Z-1b62ce",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
