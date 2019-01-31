organization := "org.scalablytyped"
name := "winston-dynamodb"
version := "0.0-unknown-dt-20181019Z-568436"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190117Z-64883e",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-c83c8b",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-b5e51f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-47617b",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-853cf7",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-e186f5",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-809d3c",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-d3f96d",
  "org.scalablytyped" %%% "winston" % "3.2.1-572027",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-1e09a1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        