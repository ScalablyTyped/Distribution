organization := "org.scalablytyped"
name := "subscriptions-transport-ws"
version := "0.9.16-8830fc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180601Z-bf11b7",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-b1c45a",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-b55033",
  "org.scalablytyped" %%% "iterall" % "1.2.2-39cc39",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-1f290b",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-329e67")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        