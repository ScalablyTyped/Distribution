organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.3.1-4c624a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.3-35f60e",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190717Z-e46800",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.2.4-a941df",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.7-b96636",
  "org.scalablytyped" %%% "twilio-sync" % "0.11.3-1e2abb",
  "org.scalablytyped" %%% "twilio-transport" % "0.3.5-825b42",
  "org.scalablytyped" %%% "twilsock" % "0.5.10-20c1e3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        