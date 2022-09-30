organization := "org.scalablytyped"
name := "update-notifier"
version := "6.0-dt-20220704Z-0c13b5"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boxen" % "7.0.0-3c4645",
  "org.scalablytyped" %%% "cli-boxes" % "3.0.0-ef4bee",
  "org.scalablytyped" %%% "configstore" % "6.0-dt-20220704Z-30516a",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "type-fest" % "3.0.0-e72bbe")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
