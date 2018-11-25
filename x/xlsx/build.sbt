organization := "com.scalablytyped"
name := "xlsx"
version := "0.14.0-85f46a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "adler-32" % "1.2.0-512619",
  "com.scalablytyped" %%% "cfb" % "1.1.0-c74c11",
  "com.scalablytyped" %%% "codepage" % "1.14.0-884908",
  "com.scalablytyped" %%% "commander" % "2.19.0-3dc169",
  "com.scalablytyped" %%% "crc-32" % "1.2.0-a02b31",
  "com.scalablytyped" %%% "frac" % "1.1.2-2f3a8b",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-5a910f",
  "com.scalablytyped" %%% "printj" % "1.1.2-fbab2e",
  "com.scalablytyped" %%% "ssf" % "0.10.2-6919c1",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        