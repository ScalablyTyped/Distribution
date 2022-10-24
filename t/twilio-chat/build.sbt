organization := "org.scalablytyped"
name := "twilio-chat"
version := "6.0.0-fb8555"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "loglevel" % "1.8.0-8a2d46",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "twilio-sync" % "3.1.0-9a1c7c",
  "org.scalablytyped" %%% "twilio__mcs-client" % "0.5.3-007aa2",
  "org.scalablytyped" %%% "twilio__notifications" % "1.0.5-561c37",
  "org.scalablytyped" %%% "twilio__replay-event-emitter" % "0.2.4-21e7ce",
  "org.scalablytyped" %%% "twilsock" % "0.12.2-6c701e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
