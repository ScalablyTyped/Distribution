organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.3.4-a6e766"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.6-128067",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.3.3-e03239",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.8-73a1a7",
  "org.scalablytyped" %%% "twilio-sync" % "0.11.5-d7a0d9",
  "org.scalablytyped" %%% "twilsock" % "0.5.11-06cad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        