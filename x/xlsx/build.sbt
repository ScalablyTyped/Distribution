organization := "org.scalablytyped"
name := "xlsx"
version := "0.14.1-60e711"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adler-32" % "1.2.0-12b7c4",
  "org.scalablytyped" %%% "cfb" % "1.1.0-181ce2",
  "org.scalablytyped" %%% "codepage" % "1.14.0-519a17",
  "org.scalablytyped" %%% "commander" % "2.19.0-e3acde",
  "org.scalablytyped" %%% "crc-32" % "1.2.0-d87526",
  "org.scalablytyped" %%% "frac" % "1.1.2-4a31c4",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-604ea6",
  "org.scalablytyped" %%% "printj" % "1.1.2-3672d3",
  "org.scalablytyped" %%% "ssf" % "0.10.2-48a22b",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        