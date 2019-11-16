organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.3.2-b8b01d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.6-d9ed65",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191115Z-3b62fb",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.3.1-6a1a1c",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.8-6df98c",
  "org.scalablytyped" %%% "twilio-sync" % "0.11.4-8437aa",
  "org.scalablytyped" %%% "twilsock" % "0.5.11-2114f4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        