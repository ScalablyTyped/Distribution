organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.3.1-58ea81"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.3-42c31f",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-c250b3",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.2.4-413759",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.7-f04da7",
  "org.scalablytyped" %%% "twilio-sync" % "0.11.3-efafd3",
  "org.scalablytyped" %%% "twilio-transport" % "0.3.5-03bb6a",
  "org.scalablytyped" %%% "twilsock" % "0.5.10-e71349")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        