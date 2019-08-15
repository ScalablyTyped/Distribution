organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.3.1-077e11"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.3-dcf9e0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-317602",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.2.4-131562",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.7-baa875",
  "org.scalablytyped" %%% "twilio-sync" % "0.11.3-ae022f",
  "org.scalablytyped" %%% "twilio-transport" % "0.3.5-a5f8f9",
  "org.scalablytyped" %%% "twilsock" % "0.5.10-0a0e35")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        