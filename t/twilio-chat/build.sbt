organization := "org.scalablytyped"
name := "twilio-chat"
version := "6.0.0-3b14fa"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "loglevel" % "1.8.1-7750ff",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "twilio-sync" % "3.1.0-488fcc",
  "org.scalablytyped" %%% "twilio__mcs-client" % "0.5.3-2dbdd3",
  "org.scalablytyped" %%% "twilio__notifications" % "1.0.5-3aa6aa",
  "org.scalablytyped" %%% "twilio__replay-event-emitter" % "0.2.4-3b9c5e",
  "org.scalablytyped" %%% "twilsock" % "0.12.2-308daf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
