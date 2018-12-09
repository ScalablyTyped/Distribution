organization := "org.scalablytyped"
name := "xlsx"
version := "0.14.1-0c659c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adler-32" % "1.2.0-2f9350",
  "org.scalablytyped" %%% "cfb" % "1.1.0-3f2ea4",
  "org.scalablytyped" %%% "codepage" % "1.14.0-2aa122",
  "org.scalablytyped" %%% "commander" % "2.19.0-d3bb02",
  "org.scalablytyped" %%% "crc-32" % "1.2.0-59c354",
  "org.scalablytyped" %%% "frac" % "1.1.2-4de33d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "printj" % "1.1.2-a0a330",
  "org.scalablytyped" %%% "ssf" % "0.10.2-8071d2",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        