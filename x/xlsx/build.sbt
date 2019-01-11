organization := "org.scalablytyped"
name := "xlsx"
version := "0.14.1-f7bcec"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adler-32" % "1.2.0-abd7c0",
  "org.scalablytyped" %%% "cfb" % "1.1.0-9577de",
  "org.scalablytyped" %%% "codepage" % "1.14.0-2b9daa",
  "org.scalablytyped" %%% "commander" % "2.19.0-69af0a",
  "org.scalablytyped" %%% "crc-32" % "1.2.0-6f0680",
  "org.scalablytyped" %%% "frac" % "1.1.2-158d99",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "printj" % "1.1.2-e43850",
  "org.scalablytyped" %%% "ssf" % "0.10.2-0978e2",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        