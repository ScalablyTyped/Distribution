organization := "org.scalablytyped"
name := "twilio-chat"
version := "6.0.0-22aa55"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "loglevel" % "1.8.0-cbcc55",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "twilio-sync" % "3.1.0-348c4c",
  "org.scalablytyped" %%% "twilio__mcs-client" % "0.5.3-5631ab",
  "org.scalablytyped" %%% "twilio__notifications" % "1.0.5-18ee67",
  "org.scalablytyped" %%% "twilio__replay-event-emitter" % "0.2.4-a4d9cc",
  "org.scalablytyped" %%% "twilsock" % "0.12.2-81ded9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
