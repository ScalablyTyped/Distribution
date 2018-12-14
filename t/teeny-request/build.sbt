organization := "org.scalablytyped"
name := "teeny-request"
version := "3.11.3-f9570e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-a94dbd",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-26a7b4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-d32d36",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-ee0213",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-eb91fb",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-bc3f32")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        