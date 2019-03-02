organization := "org.scalablytyped"
name := "winston-syslog"
version := "2.0-dt-20190212Z-0d64fd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-e7e673",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-42f736",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-74eeff",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-96d8c5",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-0e0473",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-a4554d",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-e41105",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-ce4a15",
  "org.scalablytyped" %%% "winston" % "3.2.1-53810c",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-f7f51a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        