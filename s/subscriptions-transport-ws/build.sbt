organization := "org.scalablytyped"
name := "subscriptions-transport-ws"
version := "0.9.16-d317d8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.2-ef4b6c",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190624Z-39761a",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190621Z-8f9d23",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-372ab6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        