organization := "org.scalablytyped"
name := "svg-sprite"
version := "0.0-unknown-dt-20190322Z-8faadd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-3aa38d",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-186c43",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-e63111",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-2f4f37",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-889e65",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-1895d1",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20190322Z-44140b",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-609cba",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-80129d",
  "org.scalablytyped" %%% "winston" % "3.2.1-061747",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-d43c80")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        