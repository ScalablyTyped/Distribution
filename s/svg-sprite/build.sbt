organization := "org.scalablytyped"
name := "svg-sprite"
version := "0.0-unknown-dt-20220818Z-fca902"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "logform" % "2.4.2-2366c7",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20220819Z-6aee9e",
  "org.scalablytyped" %%% "winston" % "3.8.2-24546a",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-132333")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
