organization := "org.scalablytyped"
name := "update-notifier"
version := "5.0-dt-20200930Z-39f6a3"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boxen" % "4.2.0-4601ef",
  "org.scalablytyped" %%% "cli-boxes" % "2.2.1-7b2503",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20200515Z-26d958",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "type-fest" % "0.8.1-460399")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
