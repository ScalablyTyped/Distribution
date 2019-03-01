organization := "org.scalablytyped"
name := "xlsx"
version := "0.14.1-3491b2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adler-32" % "1.2.0-347e2a",
  "org.scalablytyped" %%% "cfb" % "1.1.0-64e052",
  "org.scalablytyped" %%% "codepage" % "1.14.0-e64280",
  "org.scalablytyped" %%% "commander" % "2.19.0-17acc3",
  "org.scalablytyped" %%% "crc-32" % "1.2.0-cb328b",
  "org.scalablytyped" %%% "frac" % "1.1.2-aea7fe",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "printj" % "1.1.2-174484",
  "org.scalablytyped" %%% "ssf" % "0.10.2-48ee02",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        