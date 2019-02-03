organization := "org.scalablytyped"
name := "vfile-location"
version := "2.0-dt-20181127Z-f2fd07"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20181205Z-bf0228",
  "org.scalablytyped" %%% "vfile" % "3.0-dt-20181205Z-2050a5",
  "org.scalablytyped" %%% "vfile-message" % "1.0-dt-20181205Z-7e5ce4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        