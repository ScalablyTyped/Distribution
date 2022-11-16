organization := "org.scalablytyped"
name := "update-notifier"
version := "6.0-dt-20220704Z-6080aa"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boxen" % "7.0.0-419e29",
  "org.scalablytyped" %%% "cli-boxes" % "3.0.0-fe2750",
  "org.scalablytyped" %%% "configstore" % "6.0-dt-20220704Z-9a1e25",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "type-fest" % "3.1.0-4b2f46")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
