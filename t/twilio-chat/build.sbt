organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.2.3-b6a396"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20190205Z-4c8fdd",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190530Z-a47442",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.2.2-8b0b2a",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.4-12d2f8",
  "org.scalablytyped" %%% "twilio-sync" % "0.10.4-9c664d",
  "org.scalablytyped" %%% "twilio-transport" % "0.3.3-c36f60",
  "org.scalablytyped" %%% "twilsock" % "0.5.7-9bbd29")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        