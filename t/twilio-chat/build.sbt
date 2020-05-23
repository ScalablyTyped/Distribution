organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.3.7-fde5ea"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.8-052690",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.3.3-ec000c",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.9-99a36b",
  "org.scalablytyped" %%% "twilio-sync" % "0.12.2-9c0b2a",
  "org.scalablytyped" %%% "twilsock" % "0.5.12-3ac8ef")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
