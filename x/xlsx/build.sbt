organization := "com.scalablytyped"
name := "xlsx"
version := "0.14.1-2fe60d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "adler-32" % "1.2.0-b9eee8",
  "com.scalablytyped" %%% "cfb" % "1.1.0-4c9800",
  "com.scalablytyped" %%% "codepage" % "1.14.0-d418dd",
  "com.scalablytyped" %%% "commander" % "2.19.0-17df09",
  "com.scalablytyped" %%% "crc-32" % "1.2.0-98905b",
  "com.scalablytyped" %%% "frac" % "1.1.2-7403b6",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "printj" % "1.1.2-749e24",
  "com.scalablytyped" %%% "ssf" % "0.10.2-8381d5",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        