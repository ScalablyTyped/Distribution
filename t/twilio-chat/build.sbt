organization := "org.scalablytyped"
name := "twilio-chat"
version := "4.0.0-08dfb5"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "loglevel" % "1.7.0-18e3de",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.3.3-1c4c12",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.11-9116e8",
  "org.scalablytyped" %%% "twilio-sync" % "0.12.4-f4314b",
  "org.scalablytyped" %%% "twilsock" % "0.5.14-c626b3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
