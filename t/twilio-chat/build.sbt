organization := "org.scalablytyped"
name := "twilio-chat"
version := "6.0.0-3ea973"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "loglevel" % "1.8.0-e2e7b2",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "twilio-sync" % "3.1.0-821485",
  "org.scalablytyped" %%% "twilio__mcs-client" % "0.5.3-29d7c3",
  "org.scalablytyped" %%% "twilio__notifications" % "1.0.5-5d1846",
  "org.scalablytyped" %%% "twilio__replay-event-emitter" % "0.2.4-b9f70d",
  "org.scalablytyped" %%% "twilsock" % "0.12.2-5b9193")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
