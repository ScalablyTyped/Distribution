organization := "org.scalablytyped"
name := "typed-github-api"
version := "1.2.6-4fc17a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190117Z-64883e",
  "org.scalablytyped" %%% "blow-http-statuses" % "0.2.4-5dfa2a",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-e2423e",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-99e619",
  "org.scalablytyped" %%% "crypto-js" % "v3.1.8-dt-20180725Z-6e457a",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-3f958a",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-d79c77",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-243b75",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-b5e51f",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-5089c8",
  "org.scalablytyped" %%% "moment" % "2.24.0-cd7f45",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190130Z-351386",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-47617b",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-145d73",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-ff4c21",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-5b89f7",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-ff7651",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-809d3c",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-d3f96d",
  "org.scalablytyped" %%% "typescript-event-handler" % "1.0.0-1900f3",
  "org.scalablytyped" %%% "winston" % "3.2.1-2cd7ab",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-1383e3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        