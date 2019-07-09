organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.3.0-34e78f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.3-35f60e",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190708Z-e1e986",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.2.4-35a5a3",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.7-c50850",
  "org.scalablytyped" %%% "twilio-sync" % "0.11.2-cc9efb",
  "org.scalablytyped" %%% "twilio-transport" % "0.3.5-825b42",
  "org.scalablytyped" %%% "twilsock" % "0.5.10-557a57")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        