organization := "org.scalablytyped"
name := "vfile-location"
version := "2.0-dt-20181127Z-679006"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20181205Z-f00b8a",
  "org.scalablytyped" %%% "vfile" % "3.0-dt-20181205Z-a043df",
  "org.scalablytyped" %%% "vfile-message" % "1.0-dt-20181205Z-b86eef")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        