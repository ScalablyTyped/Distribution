organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.3.2-005e13"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.4-76bb78",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-e91184",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.3.1-000542",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.8-ad2a19",
  "org.scalablytyped" %%% "twilio-sync" % "0.11.4-ff258f",
  "org.scalablytyped" %%% "twilsock" % "0.5.11-1ecea2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        