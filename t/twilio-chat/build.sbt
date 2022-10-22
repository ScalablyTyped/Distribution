organization := "org.scalablytyped"
name := "twilio-chat"
version := "6.0.0-cf95c7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "loglevel" % "1.8.0-cbcc55",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "twilio-sync" % "3.1.0-cac1cf",
  "org.scalablytyped" %%% "twilio__mcs-client" % "0.5.3-335e2b",
  "org.scalablytyped" %%% "twilio__notifications" % "1.0.5-21ad15",
  "org.scalablytyped" %%% "twilio__replay-event-emitter" % "0.2.4-731761",
  "org.scalablytyped" %%% "twilsock" % "0.12.2-1a35d9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
