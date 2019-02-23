organization := "org.scalablytyped"
name := "vfile-location"
version := "2.0-dt-20181127Z-812ab3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190215Z-604ea6",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20190213Z-bf0228",
  "org.scalablytyped" %%% "vfile" % "3.0-dt-20181205Z-47b18c",
  "org.scalablytyped" %%% "vfile-message" % "1.0-dt-20181205Z-e22a49")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        