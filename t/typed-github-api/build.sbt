organization := "org.scalablytyped"
name := "typed-github-api"
version := "1.2.6-d4eb6b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181020Z-6ba948",
  "org.scalablytyped" %%% "blow-http-statuses" % "0.2.4-123aed",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-addcd5",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-564d85",
  "org.scalablytyped" %%% "crypto-js" % "v3.1.8-dt-20180910Z-cef7c8",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180910Z-50ee2c",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-a97c36",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180910Z-183e9d",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180910Z-756084",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-1d49f8",
  "org.scalablytyped" %%% "moment" % "2.23.0-39ab00",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-d32d36",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181208Z-481dd9",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-eb00ce",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180910Z-51b373",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180910Z-a38732",
  "org.scalablytyped" %%% "typescript-event-handler" % "1.0.0-5b3360",
  "org.scalablytyped" %%% "winston" % "3.1.0-a9d3f9",
  "org.scalablytyped" %%% "winston-transport" % "4.2.0-e5ffa5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        