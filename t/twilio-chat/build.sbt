organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.3.2-553ed6"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.4-135c7b",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191105Z-2397f3",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.3.1-55827c",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.8-4455a0",
  "org.scalablytyped" %%% "twilio-sync" % "0.11.4-e185d5",
  "org.scalablytyped" %%% "twilsock" % "0.5.11-d53cba")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        