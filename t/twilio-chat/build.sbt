organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.2.3-01f736"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20190205Z-4c8fdd",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190606Z-b7fe68",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.2.2-366e22",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.4-766f64",
  "org.scalablytyped" %%% "twilio-sync" % "0.10.4-85cc71",
  "org.scalablytyped" %%% "twilio-transport" % "0.3.3-c36f60",
  "org.scalablytyped" %%% "twilsock" % "0.5.7-bf2e16")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        