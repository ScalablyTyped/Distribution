organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.3.2-77c600"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.4-135c7b",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-a35ed6",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.3.1-fe5911",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.8-068859",
  "org.scalablytyped" %%% "twilio-sync" % "0.11.4-bd31b7",
  "org.scalablytyped" %%% "twilsock" % "0.5.11-870a97")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        