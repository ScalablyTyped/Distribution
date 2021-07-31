organization := "org.scalablytyped"
name := "tablesorter"
version := "2.31-dt-20200515Z-4d9069"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20200923Z-06a062",
  "org.scalablytyped" %%% "globalize" % "1.5-dt-20201002Z-4d292a",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20201028Z-b9c3f6",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20201002Z-ab6142",
  "org.scalablytyped" %%% "select2" % "4.0-dt-20201020Z-c761ef",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20201002Z-27ba00",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
