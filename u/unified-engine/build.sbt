organization := "org.scalablytyped"
name := "unified-engine"
version := "10.0.1-d72f62"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "trough" % "2.1.0-844ab6",
  "org.scalablytyped" %%% "unified" % "10.1.2-f95e2a",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-bd4a10",
  "org.scalablytyped" %%% "vfile" % "5.3.5-c74e3a",
  "org.scalablytyped" %%% "vfile-message" % "3.1.2-d40e70")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
