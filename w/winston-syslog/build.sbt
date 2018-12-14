organization := "org.scalablytyped"
name := "winston-syslog"
version := "2.0-dt-20181109Z-0d29bf"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181020Z-6ba948",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180910Z-183e9d",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180910Z-756084",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180910Z-51b373",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180910Z-a38732",
  "org.scalablytyped" %%% "winston" % "3.1.0-a9d3f9",
  "org.scalablytyped" %%% "winston-transport" % "4.2.0-e5ffa5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        