organization := "org.scalablytyped"
name := "twilio-chat"
version := "4.0.0-ec3950"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "loglevel" % "1.7.0-f01734",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.3.3-f6deeb",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.11-302c3a",
  "org.scalablytyped" %%% "twilio-sync" % "0.12.4-53839f",
  "org.scalablytyped" %%% "twilsock" % "0.5.14-d0576c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
