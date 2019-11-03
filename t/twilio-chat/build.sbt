organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.3.2-f8368e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.4-135c7b",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191101Z-508d7c",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.3.1-2de44e",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.8-2d05fc",
  "org.scalablytyped" %%% "twilio-sync" % "0.11.4-50018b",
  "org.scalablytyped" %%% "twilsock" % "0.5.11-077194")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        