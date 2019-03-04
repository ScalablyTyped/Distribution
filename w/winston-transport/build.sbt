organization := "org.scalablytyped"
name := "winston-transport"
version := "4.3.0-ee24cd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-4e8c11",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-935d9f",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-0a9f78",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-bcda47")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        