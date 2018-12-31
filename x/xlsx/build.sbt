organization := "org.scalablytyped"
name := "xlsx"
version := "0.14.1-7d68de"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adler-32" % "1.2.0-36b070",
  "org.scalablytyped" %%% "cfb" % "1.1.0-d6873b",
  "org.scalablytyped" %%% "codepage" % "1.14.0-e2a17e",
  "org.scalablytyped" %%% "commander" % "2.19.0-30fe69",
  "org.scalablytyped" %%% "crc-32" % "1.2.0-7ee9f9",
  "org.scalablytyped" %%% "frac" % "1.1.2-792bb5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "printj" % "1.1.2-87e27b",
  "org.scalablytyped" %%% "ssf" % "0.10.2-55b8c3",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        