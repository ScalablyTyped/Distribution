organization := "org.scalablytyped"
name := "vfile-location"
version := "2.0-dt-20181127Z-a4a1f7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190426Z-d35e72",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20190213Z-6ac828",
  "org.scalablytyped" %%% "vfile" % "3.0-dt-20181205Z-f6108f",
  "org.scalablytyped" %%% "vfile-message" % "1.0-dt-20181205Z-aca493")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        