organization := "org.scalablytyped"
name := "update-notifier"
version := "6.0-dt-20230521Z-3313aa"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boxen" % "7.1.0-c10ade",
  "org.scalablytyped" %%% "cli-boxes" % "3.0.0-f5839a",
  "org.scalablytyped" %%% "configstore" % "6.0-dt-20220704Z-18962c",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2",
  "org.scalablytyped" %%% "type-fest" % "3.12.0-be920d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
