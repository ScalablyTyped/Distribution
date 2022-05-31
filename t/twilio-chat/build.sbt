organization := "org.scalablytyped"
name := "twilio-chat"
version := "4.0.0-d1de2c"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "loglevel" % "1.7.0-18e3de",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.3.3-f425dc",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.11-0ff1cf",
  "org.scalablytyped" %%% "twilio-sync" % "0.12.4-04654b",
  "org.scalablytyped" %%% "twilsock" % "0.5.14-99e948")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
