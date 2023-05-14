organization := "org.scalablytyped"
name := "twilio-chat"
version := "6.0.0-4c1d4b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "loglevel" % "1.8.1-7750ff",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "twilio-sync" % "3.1.0-602b77",
  "org.scalablytyped" %%% "twilio__mcs-client" % "0.5.3-569793",
  "org.scalablytyped" %%% "twilio__notifications" % "1.0.5-8afc15",
  "org.scalablytyped" %%% "twilio__replay-event-emitter" % "0.2.4-3fa789",
  "org.scalablytyped" %%% "twilsock" % "0.12.2-8293a4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
