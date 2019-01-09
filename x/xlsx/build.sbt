organization := "org.scalablytyped"
name := "xlsx"
version := "0.14.1-54c395"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adler-32" % "1.2.0-e4b78f",
  "org.scalablytyped" %%% "cfb" % "1.1.0-70ba28",
  "org.scalablytyped" %%% "codepage" % "1.14.0-4b9961",
  "org.scalablytyped" %%% "commander" % "2.19.0-12e126",
  "org.scalablytyped" %%% "crc-32" % "1.2.0-87c258",
  "org.scalablytyped" %%% "frac" % "1.1.2-ec1e5d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "printj" % "1.1.2-33ecaf",
  "org.scalablytyped" %%% "ssf" % "0.10.2-1d470a",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        