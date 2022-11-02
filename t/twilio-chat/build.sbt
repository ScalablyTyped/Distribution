organization := "org.scalablytyped"
name := "twilio-chat"
version := "6.0.0-2bcdad"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "loglevel" % "1.8.0-8a2d46",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "twilio-sync" % "3.1.0-b39f78",
  "org.scalablytyped" %%% "twilio__mcs-client" % "0.5.3-cf0213",
  "org.scalablytyped" %%% "twilio__notifications" % "1.0.5-c2c4c0",
  "org.scalablytyped" %%% "twilio__replay-event-emitter" % "0.2.4-62df58",
  "org.scalablytyped" %%% "twilsock" % "0.12.2-09f55d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
