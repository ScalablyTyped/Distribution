organization := "com.scalablytyped"
name := "typed-github-api"
version := "1.2.6-ffe3a7"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "async" % "2.0.1-dt-20181020Z-4e61c0",
  "com.scalablytyped" %%% "blow-http-statuses" % "0.2.4-73a477",
  "com.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-6ca2c5",
  "com.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-feceb2",
  "com.scalablytyped" %%% "crypto-js" % "v3.1.8-dt-20180910Z-00e45f",
  "com.scalablytyped" %%% "express" % "4.16-dt-20180910Z-4d8764",
  "com.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-43b19a",
  "com.scalablytyped" %%% "is-stream" % "1.1-dt-20180910Z-4f5489",
  "com.scalablytyped" %%% "logform" % "1.2-dt-20180910Z-9d5b62",
  "com.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-f9ab87",
  "com.scalablytyped" %%% "moment" % "2.22.2-b3769a",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-cadd20",
  "com.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-1f4e97",
  "com.scalablytyped" %%% "range-parser" % "1.2-dt-20180910Z-dfa7aa",
  "com.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-5d47cf",
  "com.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180910Z-d3ba3d",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "triple-beam" % "1.3-dt-20180910Z-60e569",
  "com.scalablytyped" %%% "typescript-event-handler" % "1.0.0-5da24d",
  "com.scalablytyped" %%% "winston" % "3.1.0-beb718",
  "com.scalablytyped" %%% "winston-transport" % "4.2.0-5f641b",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        