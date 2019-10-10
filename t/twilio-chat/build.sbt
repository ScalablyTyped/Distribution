organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.3.2-63b022"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.4-135c7b",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-8637fd",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.3.1-a7faa6",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.8-7bdbd0",
  "org.scalablytyped" %%% "twilio-sync" % "0.11.4-8b7362",
  "org.scalablytyped" %%% "twilsock" % "0.5.11-801a31")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        