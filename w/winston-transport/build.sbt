organization := "org.scalablytyped"
name := "winston-transport"
version := "4.3.0-6bb921"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-4841be",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-b635c8",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-fef2c2",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-c1833f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        