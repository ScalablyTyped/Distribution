organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.3.1-db0378"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.3-d3cd35",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-2dc4df",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.2.4-e1335b",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.7-06b465",
  "org.scalablytyped" %%% "twilio-sync" % "0.11.3-c1a667",
  "org.scalablytyped" %%% "twilio-transport" % "0.3.5-9121a0",
  "org.scalablytyped" %%% "twilsock" % "0.5.10-65c94b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        