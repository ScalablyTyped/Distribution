organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.3.4-650ebd"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.7-145153",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.3.3-abdccf",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.8-4bfd03",
  "org.scalablytyped" %%% "twilio-sync" % "0.11.5-9e045c",
  "org.scalablytyped" %%% "twilsock" % "0.5.11-30ae6c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
