organization := "org.scalablytyped"
name := "winston-mail"
version := "1.5-dt-20181019Z-e85e69"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181121Z-7389a9",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-2b8873",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-1dd23a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-0bd5f5",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-ca97c1",
  "org.scalablytyped" %%% "winston" % "3.1.0-cbac64",
  "org.scalablytyped" %%% "winston-transport" % "4.2.0-ca0971")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        