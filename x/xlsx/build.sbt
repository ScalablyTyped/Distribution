organization := "org.scalablytyped"
name := "xlsx"
version := "0.14.1-37b457"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adler-32" % "1.2.0-601d6d",
  "org.scalablytyped" %%% "cfb" % "1.1.0-c333b5",
  "org.scalablytyped" %%% "codepage" % "1.14.0-aea373",
  "org.scalablytyped" %%% "commander" % "2.19.0-b7449f",
  "org.scalablytyped" %%% "crc-32" % "1.2.0-d81e15",
  "org.scalablytyped" %%% "frac" % "1.1.2-33cbc7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "printj" % "1.1.2-ead168",
  "org.scalablytyped" %%% "ssf" % "0.10.2-55eb47",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        