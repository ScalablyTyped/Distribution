organization := "org.scalablytyped"
name := "subscriptions-transport-ws"
version := "0.9.16-551006"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.2-34d51a",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-3a9110",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-1fb914",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-fb977b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        