organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.3.4-2b34ba"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.6-2fdad9",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.3.3-f97cfc",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.8-6d777e",
  "org.scalablytyped" %%% "twilio-sync" % "0.11.5-102d9f",
  "org.scalablytyped" %%% "twilsock" % "0.5.11-8c6a64")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        