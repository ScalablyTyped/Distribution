organization := "org.scalablytyped"
name := "twilio-chat"
version := "4.0.0-334b54"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.7.0-66ea6b",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.3.3-0b35c0",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.11-d47900",
  "org.scalablytyped" %%% "twilio-sync" % "0.12.4-b3d30d",
  "org.scalablytyped" %%% "twilsock" % "0.5.14-d9ecb1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
