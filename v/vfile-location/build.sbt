organization := "org.scalablytyped"
name := "vfile-location"
version := "2.0-dt-20181127Z-6471e5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20181205Z-d06828",
  "org.scalablytyped" %%% "vfile" % "3.0-dt-20181205Z-f6c737",
  "org.scalablytyped" %%% "vfile-message" % "1.0-dt-20181205Z-cb655f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        