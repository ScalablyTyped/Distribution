organization := "org.scalablytyped"
name := "twilio-chat"
version := "6.0.0-3ef9e4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "loglevel" % "1.8.1-34f6e8",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "twilio-sync" % "3.1.0-2fb8e6",
  "org.scalablytyped" %%% "twilio__mcs-client" % "0.5.3-82e3ed",
  "org.scalablytyped" %%% "twilio__notifications" % "1.0.5-f4ccb8",
  "org.scalablytyped" %%% "twilio__replay-event-emitter" % "0.2.4-62df58",
  "org.scalablytyped" %%% "twilsock" % "0.12.2-3e2551")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
