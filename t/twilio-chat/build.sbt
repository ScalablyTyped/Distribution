organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.2.3-ce4db9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20190205Z-4c8fdd",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.2.2-0fcf79",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.4-f44746",
  "org.scalablytyped" %%% "twilio-sync" % "0.10.4-2236f5",
  "org.scalablytyped" %%% "twilio-transport" % "0.3.3-0e994e",
  "org.scalablytyped" %%% "twilsock" % "0.5.7-4ea18b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        