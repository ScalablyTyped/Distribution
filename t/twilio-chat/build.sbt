organization := "org.scalablytyped"
name := "twilio-chat"
version := "6.0.0-f1f63e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "loglevel" % "1.8.0-cbcc55",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "twilio-sync" % "3.1.0-bcd727",
  "org.scalablytyped" %%% "twilio__mcs-client" % "0.5.3-12b87a",
  "org.scalablytyped" %%% "twilio__notifications" % "1.0.5-d00236",
  "org.scalablytyped" %%% "twilio__replay-event-emitter" % "0.2.4-491477",
  "org.scalablytyped" %%% "twilsock" % "0.12.2-91238d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
