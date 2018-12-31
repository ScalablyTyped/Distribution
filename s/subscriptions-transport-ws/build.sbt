organization := "org.scalablytyped"
name := "subscriptions-transport-ws"
version := "0.9.15-0ce6d9"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180601Z-5aca12",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-f1fa89",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181016Z-ed78a4",
  "org.scalablytyped" %%% "iterall" % "1.2.2-1d5c18",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-dc48cb",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-5fcabc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        