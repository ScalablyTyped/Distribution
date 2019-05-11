organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.2.3-853d9b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20190205Z-de82c8",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-cb8223",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.2.2-35928a",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.4-a6dfb1",
  "org.scalablytyped" %%% "twilio-sync" % "0.10.4-95ffdc",
  "org.scalablytyped" %%% "twilio-transport" % "0.3.3-6df018",
  "org.scalablytyped" %%% "twilsock" % "0.5.7-4db1ec")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        