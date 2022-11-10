organization := "org.scalablytyped"
name := "twilio-chat"
version := "6.0.0-ccee2c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "loglevel" % "1.8.1-34f6e8",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "twilio-sync" % "3.1.0-a5afdf",
  "org.scalablytyped" %%% "twilio__mcs-client" % "0.5.3-e74218",
  "org.scalablytyped" %%% "twilio__notifications" % "1.0.5-caec83",
  "org.scalablytyped" %%% "twilio__replay-event-emitter" % "0.2.4-d73fb1",
  "org.scalablytyped" %%% "twilsock" % "0.12.2-4d04d2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
