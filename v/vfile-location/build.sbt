organization := "org.scalablytyped"
name := "vfile-location"
version := "2.0-dt-20181128Z-815bbd"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20181205Z-50a3b8",
  "org.scalablytyped" %%% "vfile" % "3.0-dt-20181205Z-a1b8f7",
  "org.scalablytyped" %%% "vfile-message" % "1.0-dt-20181205Z-2525f9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        