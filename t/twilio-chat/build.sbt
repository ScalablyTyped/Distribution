organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.3.0-9ac844"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.3-123167",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-0260d9",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.2.4-8e791a",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.7-d2526e",
  "org.scalablytyped" %%% "twilio-sync" % "0.11.2-0a8999",
  "org.scalablytyped" %%% "twilio-transport" % "0.3.5-fd8d72",
  "org.scalablytyped" %%% "twilsock" % "0.5.10-b54cea")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        