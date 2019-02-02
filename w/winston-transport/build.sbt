organization := "org.scalablytyped"
name := "winston-transport"
version := "4.3.0-1383e3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-b5e51f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-ff4c21",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-5b89f7",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-d3f96d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        