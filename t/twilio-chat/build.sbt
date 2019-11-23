organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.3.2-f7d349"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.6-d9ed65",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-304e79",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.3.1-2ac80d",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.8-90a269",
  "org.scalablytyped" %%% "twilio-sync" % "0.11.4-bdba31",
  "org.scalablytyped" %%% "twilsock" % "0.5.11-3ac17c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        