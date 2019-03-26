organization := "org.scalablytyped"
name := "winston-transport"
version := "4.3.0-d43c80"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-e63111",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-889e65",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-1895d1",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-609cba")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        