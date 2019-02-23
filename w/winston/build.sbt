organization := "org.scalablytyped"
name := "winston"
version := "3.2.1-59b6a0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-ca81e9",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-f5ed00",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-640fda",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190215Z-604ea6",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-d1795e",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-4b5ba6",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-dbae89",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-2f7239",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-becbe4",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-2d6f09")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        