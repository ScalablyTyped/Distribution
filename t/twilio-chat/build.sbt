organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.2.3-0deb1e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20190205Z-de82c8",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-d681c7",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.2.2-4b6878",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.4-7dd11c",
  "org.scalablytyped" %%% "twilio-sync" % "0.10.4-1415d4",
  "org.scalablytyped" %%% "twilio-transport" % "0.3.3-7d34a7",
  "org.scalablytyped" %%% "twilsock" % "0.5.7-46865e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        