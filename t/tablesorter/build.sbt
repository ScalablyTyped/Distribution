organization := "org.scalablytyped"
name := "tablesorter"
version := "2.31-dt-20200515Z-bfa117"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20200923Z-f7e1cc",
  "org.scalablytyped" %%% "globalize" % "1.5-dt-20201002Z-bd72c3",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20201028Z-b65a9c",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20201002Z-c8616b",
  "org.scalablytyped" %%% "select2" % "4.0-dt-20201020Z-d37a9e",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20201002Z-00b6a0",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
