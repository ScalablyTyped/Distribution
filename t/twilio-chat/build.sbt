organization := "org.scalablytyped"
name := "twilio-chat"
version := "6.0.0-29944c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "loglevel" % "1.8.1-c810c5",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "twilio-sync" % "3.1.0-7e0e4d",
  "org.scalablytyped" %%% "twilio__mcs-client" % "0.5.3-dd55c9",
  "org.scalablytyped" %%% "twilio__notifications" % "1.0.5-51c3f5",
  "org.scalablytyped" %%% "twilio__replay-event-emitter" % "0.2.4-1ba17e",
  "org.scalablytyped" %%% "twilsock" % "0.12.2-118154")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
