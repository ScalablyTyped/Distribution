organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.3.4-21a7bf"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.7-145153",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.3.3-214168",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.8-61a1d4",
  "org.scalablytyped" %%% "twilio-sync" % "0.11.5-27298a",
  "org.scalablytyped" %%% "twilsock" % "0.5.11-7909aa")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
