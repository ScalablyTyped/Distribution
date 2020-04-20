organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.3.5-8d927c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.8-ea5aea",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.3.3-a37865",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.8-d7647a",
  "org.scalablytyped" %%% "twilio-sync" % "0.12.1-20c125",
  "org.scalablytyped" %%% "twilsock" % "0.5.11-55af35")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
