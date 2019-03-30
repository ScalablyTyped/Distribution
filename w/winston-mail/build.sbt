organization := "org.scalablytyped"
name := "winston-mail"
version := "1.5-dt-20181019Z-b202bd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-7b85eb",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-ea92b3",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-54f634",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-dea611",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-c565bc",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-195cbe",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20190322Z-ad49e2",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-5108a8",
  "org.scalablytyped" %%% "winston" % "3.2.1-4124d7",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-4070d5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        