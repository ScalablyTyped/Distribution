organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.3.3-8d44f2"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.6-caaa6c",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.3.1-ccf2e5",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.8-6f5714",
  "org.scalablytyped" %%% "twilio-sync" % "0.11.5-d4e08a",
  "org.scalablytyped" %%% "twilsock" % "0.5.11-61bc78")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        