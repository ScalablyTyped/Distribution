organization := "org.scalablytyped"
name := "temp-file"
version := "3.3.2-53de61"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181214Z-e561d3",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-03e3ad",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-ffc598",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-beb3d2",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-21ad57",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        