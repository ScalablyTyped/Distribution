organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.3.3-b7853f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.6-caaa6c",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.3.1-1a4ae2",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.8-ed4607",
  "org.scalablytyped" %%% "twilio-sync" % "0.11.5-f2b8be",
  "org.scalablytyped" %%% "twilsock" % "0.5.11-2c7831")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        