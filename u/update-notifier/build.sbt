organization := "org.scalablytyped"
name := "update-notifier"
version := "5.0-dt-20200930Z-285ad2"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boxen" % "4.2.0-11ebf8",
  "org.scalablytyped" %%% "cli-boxes" % "2.2.1-7b2503",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20200515Z-26d958",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "type-fest" % "0.8.1-34bec6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
