organization := "org.scalablytyped"
name := "winston-syslog"
version := "2.0-dt-20181106Z-6e136d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181121Z-64ec94",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-05cad5",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-0775ff",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-143c6f",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-67b6d7",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-0d1281",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-645b7e",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-ca0ce5",
  "org.scalablytyped" %%% "winston" % "3.1.0-22d8af",
  "org.scalablytyped" %%% "winston-transport" % "4.2.0-a7c471")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        