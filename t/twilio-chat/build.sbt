organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.2.3-aac39a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20190205Z-de82c8",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-40b461",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.2.2-87be70",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.4-509c6c",
  "org.scalablytyped" %%% "twilio-sync" % "0.10.4-e2b46f",
  "org.scalablytyped" %%% "twilio-transport" % "0.3.3-7d34a7",
  "org.scalablytyped" %%% "twilsock" % "0.5.7-064447")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        