organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.2.3-3b360d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.3-123167",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190621Z-8f9d23",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.2.2-de90aa",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.4-d87ce5",
  "org.scalablytyped" %%% "twilio-sync" % "0.10.4-99a4d5",
  "org.scalablytyped" %%% "twilio-transport" % "0.3.3-d58436",
  "org.scalablytyped" %%% "twilsock" % "0.5.7-5e075c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        