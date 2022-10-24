organization := "org.scalablytyped"
name := "update-notifier"
version := "6.0-dt-20220704Z-37a81d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boxen" % "7.0.0-46c388",
  "org.scalablytyped" %%% "cli-boxes" % "3.0.0-8be57d",
  "org.scalablytyped" %%% "configstore" % "6.0-dt-20220704Z-c1cc54",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "type-fest" % "3.1.0-3dc798")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
