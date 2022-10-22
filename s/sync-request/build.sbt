organization := "org.scalablytyped"
name := "sync-request"
version := "6.1.0-aaf72c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "form-data" % "4.0.0-a4cd97",
  "org.scalablytyped" %%% "http-basic" % "8.1.3-05b747",
  "org.scalablytyped" %%% "http-response-object" % "3.0.2-2960da",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "promise" % "8.2.0-89ab6e",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "then-request" % "6.0.2-4afffa")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
