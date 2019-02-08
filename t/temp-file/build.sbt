organization := "org.scalablytyped"
name := "temp-file"
version := "3.3.2-eb7543"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-f01776",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-9deb1a",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-05534d",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-66c997",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-9f73ab",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        