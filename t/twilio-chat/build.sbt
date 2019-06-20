organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.2.3-6dcac7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20190205Z-4c8fdd",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-b8909f",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.2.2-4a462b",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.4-d71827",
  "org.scalablytyped" %%% "twilio-sync" % "0.10.4-2f22de",
  "org.scalablytyped" %%% "twilio-transport" % "0.3.3-d58436",
  "org.scalablytyped" %%% "twilsock" % "0.5.7-3206e6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        