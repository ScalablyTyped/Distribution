organization := "org.scalablytyped"
name := "xlsx"
version := "0.14.2-a0ebc0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adler-32" % "1.2.0-5dd5eb",
  "org.scalablytyped" %%% "cfb" % "1.1.0-f7d256",
  "org.scalablytyped" %%% "codepage" % "1.14.0-e1cdbe",
  "org.scalablytyped" %%% "commander" % "2.19.0-4db880",
  "org.scalablytyped" %%% "crc-32" % "1.2.0-075bed",
  "org.scalablytyped" %%% "frac" % "1.1.2-f76420",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "printj" % "1.1.2-db9aa0",
  "org.scalablytyped" %%% "ssf" % "0.10.2-43a410",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        