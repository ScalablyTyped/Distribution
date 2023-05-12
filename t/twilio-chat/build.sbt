organization := "org.scalablytyped"
name := "twilio-chat"
version := "6.0.0-7ddfd8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "loglevel" % "1.8.1-7750ff",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "twilio-sync" % "3.1.0-7716fe",
  "org.scalablytyped" %%% "twilio__mcs-client" % "0.5.3-141435",
  "org.scalablytyped" %%% "twilio__notifications" % "1.0.5-a5324a",
  "org.scalablytyped" %%% "twilio__replay-event-emitter" % "0.2.4-f89923",
  "org.scalablytyped" %%% "twilsock" % "0.12.2-9d5427")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
