organization := "org.scalablytyped"
name := "svg-sprite"
version := "0.0-unknown-dt-20201002Z-89a26f"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "logform" % "2.2.0-15b769",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20201002Z-85853c",
  "org.scalablytyped" %%% "winston" % "3.3.3-c007df",
  "org.scalablytyped" %%% "winston-transport" % "4.4.0-b49518")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
