organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.4.0-dd0fbd"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.8-052690",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.3.3-891303",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.9-2c7903",
  "org.scalablytyped" %%% "twilio-sync" % "0.12.2-d8eb47",
  "org.scalablytyped" %%% "twilsock" % "0.5.12-931b91")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
