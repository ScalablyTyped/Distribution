organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.3.0-dfd254"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.3-123167",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190621Z-8f9d23",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.2.4-4c9b5e",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.7-d87ce5",
  "org.scalablytyped" %%% "twilio-sync" % "0.11.2-9ac23b",
  "org.scalablytyped" %%% "twilio-transport" % "0.3.5-fd8d72",
  "org.scalablytyped" %%% "twilsock" % "0.5.10-2cb095")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        