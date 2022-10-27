organization := "org.scalablytyped"
name := "twilio-chat"
version := "6.0.0-35418e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "loglevel" % "1.8.0-8a2d46",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "twilio-sync" % "3.1.0-143437",
  "org.scalablytyped" %%% "twilio__mcs-client" % "0.5.3-5a9a6d",
  "org.scalablytyped" %%% "twilio__notifications" % "1.0.5-14d0f2",
  "org.scalablytyped" %%% "twilio__replay-event-emitter" % "0.2.4-6c2e69",
  "org.scalablytyped" %%% "twilsock" % "0.12.2-be772f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
