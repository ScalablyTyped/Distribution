organization := "org.scalablytyped"
name := "twilio-chat"
version := "4.0.0-a09609"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.8-ee6dc0",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.3.3-c4b6c1",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.9-743b3a",
  "org.scalablytyped" %%% "twilio-sync" % "0.12.2-800df5",
  "org.scalablytyped" %%% "twilsock" % "0.5.12-dc3d43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
