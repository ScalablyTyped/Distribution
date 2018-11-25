organization := "com.scalablytyped"
name := "winston-syslog"
version := "2.0-dt-20181109Z-f55774"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "async" % "2.0.1-dt-20181020Z-4e61c0",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "is-stream" % "1.1-dt-20180910Z-75f290",
  "com.scalablytyped" %%% "logform" % "1.2-dt-20180910Z-9d5b62",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180910Z-d3ba3d",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "triple-beam" % "1.3-dt-20180910Z-60e569",
  "com.scalablytyped" %%% "winston" % "3.1.0-ef7bc8",
  "com.scalablytyped" %%% "winston-transport" % "4.2.0-70f907",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        