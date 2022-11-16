organization := "org.scalablytyped"
name := "svg-sprite"
version := "0.0-unknown-dt-20221103Z-b7b3ca"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "logform" % "2.4.2-48c445",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20221107Z-985447",
  "org.scalablytyped" %%% "winston" % "3.8.2-9be0e7",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-a397dd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
