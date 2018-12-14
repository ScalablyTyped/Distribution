organization := "org.scalablytyped"
name := "temp-file"
version := "3.3.2-ee6f2f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181214Z-21934a",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-28c29e",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-624f1c",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-b30a1d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        