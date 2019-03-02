organization := "org.scalablytyped"
name := "vfile-location"
version := "2.0-dt-20181127Z-4caf50"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20190213Z-3a5df7",
  "org.scalablytyped" %%% "vfile" % "3.0-dt-20181205Z-1e2515",
  "org.scalablytyped" %%% "vfile-message" % "1.0-dt-20181205Z-eb1286")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        