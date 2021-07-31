organization := "org.scalablytyped"
name := "yargs"
version := "15.4.1-fb3fd2"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "require-directory" % "2.1-dt-20200515Z-8ef0e1",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "y18n" % "4.0-dt-20200515Z-57e5e0",
  "org.scalablytyped" %%% "yargs-parser" % "15.0-dt-20200113Z-937f37")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
