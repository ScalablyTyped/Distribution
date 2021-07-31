organization := "org.scalablytyped"
name := "twilio-chat"
version := "4.0.0-551e5b"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "loglevel" % "1.7.0-8481b0",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.3.3-afa7cc",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.11-ec8c4a",
  "org.scalablytyped" %%% "twilio-sync" % "0.12.4-9a9d3a",
  "org.scalablytyped" %%% "twilsock" % "0.5.14-b943a0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
