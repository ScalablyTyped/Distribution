organization := "com.scalablytyped"
name := "temp-file"
version := "3.1.3-5f88d0"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-3124ce",
  "com.scalablytyped" %%% "bluebird-lst" % "1.0.5-f4447e",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-9b03c0",
  "com.scalablytyped" %%% "fs-extra-p" % "4.6.1-909f0f",
  "com.scalablytyped" %%% "lazy-val" % "1.0.3-501d39",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        