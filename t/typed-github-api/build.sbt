organization := "org.scalablytyped"
name := "typed-github-api"
version := "1.2.6-1d1c5a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181020Z-c71af2",
  "org.scalablytyped" %%% "blow-http-statuses" % "0.2.4-eeabeb",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-5f074c",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-95bd8f",
  "org.scalablytyped" %%% "crypto-js" % "v3.1.8-dt-20180910Z-5a99b9",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180910Z-c7573b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-702174",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180910Z-9ef893",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180910Z-901b5f",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-60e32c",
  "org.scalablytyped" %%% "moment" % "2.22.2-d1dfb5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-a76757",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181208Z-7e710f",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-35654c",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180910Z-e2b59e",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180910Z-f5c351",
  "org.scalablytyped" %%% "typescript-event-handler" % "1.0.0-31899e",
  "org.scalablytyped" %%% "winston" % "3.1.0-4d03ad",
  "org.scalablytyped" %%% "winston-transport" % "4.2.0-08fbaa")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        