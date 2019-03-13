organization := "org.scalablytyped"
name := "vfile-location"
version := "2.0-dt-20181127Z-99d515"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20190213Z-aed2e5",
  "org.scalablytyped" %%% "vfile" % "3.0-dt-20181205Z-d4605a",
  "org.scalablytyped" %%% "vfile-message" % "1.0-dt-20181205Z-b00552")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        