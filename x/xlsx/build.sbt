organization := "org.scalablytyped"
name := "xlsx"
version := "0.14.1-3d91af"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adler-32" % "1.2.0-f896d5",
  "org.scalablytyped" %%% "cfb" % "1.1.0-586667",
  "org.scalablytyped" %%% "codepage" % "1.14.0-417181",
  "org.scalablytyped" %%% "commander" % "2.19.0-89f8ea",
  "org.scalablytyped" %%% "crc-32" % "1.2.0-0a7f95",
  "org.scalablytyped" %%% "frac" % "1.1.2-3d610e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "printj" % "1.1.2-692251",
  "org.scalablytyped" %%% "ssf" % "0.10.2-8658e0",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        