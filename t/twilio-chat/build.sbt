organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.2.3-8c6a28"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20190205Z-4c8fdd",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.2.2-11bbbe",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.4-8cfe36",
  "org.scalablytyped" %%% "twilio-sync" % "0.10.4-7328da",
  "org.scalablytyped" %%% "twilio-transport" % "0.3.3-2635e8",
  "org.scalablytyped" %%% "twilsock" % "0.5.7-97a8db")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        