organization := "org.scalablytyped"
name := "subscriptions-transport-ws"
version := "0.9.15-198b5c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180601Z-4fbb23",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-10d18d",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190107Z-53c658",
  "org.scalablytyped" %%% "iterall" % "1.2.2-d67a65",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-e21f3d",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-641db8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        