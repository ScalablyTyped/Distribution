organization := "org.scalablytyped"
name := "xlsx"
version := "0.14.1-7e0e8a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adler-32" % "1.2.0-fa4ef1",
  "org.scalablytyped" %%% "cfb" % "1.1.0-9e98e3",
  "org.scalablytyped" %%% "codepage" % "1.14.0-5dc824",
  "org.scalablytyped" %%% "commander" % "2.19.0-a5966d",
  "org.scalablytyped" %%% "crc-32" % "1.2.0-9bec2b",
  "org.scalablytyped" %%% "frac" % "1.1.2-b93115",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190318Z-f6d9fe",
  "org.scalablytyped" %%% "printj" % "1.1.2-5c0090",
  "org.scalablytyped" %%% "ssf" % "0.10.2-ba7851",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        