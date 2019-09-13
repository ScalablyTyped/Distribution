organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.3.1-048402"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.4-76bb78",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190911Z-da4655",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.2.4-b72b16",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.7-51b45f",
  "org.scalablytyped" %%% "twilio-sync" % "0.11.3-fdf468",
  "org.scalablytyped" %%% "twilio-transport" % "0.3.5-03bb6a",
  "org.scalablytyped" %%% "twilsock" % "0.5.10-7afeab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        