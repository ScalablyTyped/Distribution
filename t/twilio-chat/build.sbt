organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.3.1-d3c13a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.3-dcf9e0",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190717Z-f93e3e",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.2.4-871917",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.7-6d7bf1",
  "org.scalablytyped" %%% "twilio-sync" % "0.11.3-430e42",
  "org.scalablytyped" %%% "twilio-transport" % "0.3.5-a5f8f9",
  "org.scalablytyped" %%% "twilsock" % "0.5.10-802c50")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        