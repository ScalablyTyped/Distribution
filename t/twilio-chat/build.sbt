organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.3.1-7d6c4f"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.3-42c31f",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.2.4-03d2ba",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.7-635999",
  "org.scalablytyped" %%% "twilio-sync" % "0.11.3-fc1fbd",
  "org.scalablytyped" %%% "twilio-transport" % "0.3.5-975cf3",
  "org.scalablytyped" %%% "twilsock" % "0.5.10-9562d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        