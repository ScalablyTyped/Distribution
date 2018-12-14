organization := "org.scalablytyped"
name := "xlsx"
version := "0.14.1-299a38"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adler-32" % "1.2.0-91aed2",
  "org.scalablytyped" %%% "cfb" % "1.1.0-2bd7d2",
  "org.scalablytyped" %%% "codepage" % "1.14.0-08f049",
  "org.scalablytyped" %%% "commander" % "2.19.0-35aea4",
  "org.scalablytyped" %%% "crc-32" % "1.2.0-e560b8",
  "org.scalablytyped" %%% "frac" % "1.1.2-2e9c88",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-21ad57",
  "org.scalablytyped" %%% "printj" % "1.1.2-aef0ba",
  "org.scalablytyped" %%% "ssf" % "0.10.2-c9ba65",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        