organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.3.4-f38545"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.6-128067",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.3.3-aac662",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.8-b7607c",
  "org.scalablytyped" %%% "twilio-sync" % "0.11.5-fe9329",
  "org.scalablytyped" %%% "twilsock" % "0.5.11-e5ad6f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        