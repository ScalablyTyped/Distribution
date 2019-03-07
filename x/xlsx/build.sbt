organization := "org.scalablytyped"
name := "xlsx"
version := "0.14.1-32b15e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adler-32" % "1.2.0-5b028a",
  "org.scalablytyped" %%% "cfb" % "1.1.0-209981",
  "org.scalablytyped" %%% "codepage" % "1.14.0-e9ecba",
  "org.scalablytyped" %%% "commander" % "2.19.0-c77268",
  "org.scalablytyped" %%% "crc-32" % "1.2.0-d68812",
  "org.scalablytyped" %%% "frac" % "1.1.2-08d4f4",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "printj" % "1.1.2-392669",
  "org.scalablytyped" %%% "ssf" % "0.10.2-f02054",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        