organization := "org.scalablytyped"
name := "svg-sprite"
version := "0.0-unknown-dt-20181017Z-52c9a1"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181121Z-0b1654",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-08022e",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-0b377c",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-789604",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-6f1184",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-ca5832",
  "org.scalablytyped" %%% "winston" % "3.1.0-aa556b",
  "org.scalablytyped" %%% "winston-transport" % "4.2.0-9283fe")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        