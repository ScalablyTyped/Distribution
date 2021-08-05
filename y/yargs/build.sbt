organization := "org.scalablytyped"
name := "yargs"
version := "15.4.1-7eec60"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "require-directory" % "2.1-dt-20200515Z-49640f",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "y18n" % "4.0-dt-20200515Z-c43d33",
  "org.scalablytyped" %%% "yargs-parser" % "15.0-dt-20200113Z-8b9dbf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
