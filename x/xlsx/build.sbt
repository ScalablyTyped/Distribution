organization := "com.scalablytyped"
name := "xlsx"
version := "0.14.1-cfb671"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "adler-32" % "1.2.0-b9eee8",
  "com.scalablytyped" %%% "cfb" % "1.1.0-210ba2",
  "com.scalablytyped" %%% "codepage" % "1.14.0-99692e",
  "com.scalablytyped" %%% "commander" % "2.19.0-3aaacc",
  "com.scalablytyped" %%% "crc-32" % "1.2.0-98905b",
  "com.scalablytyped" %%% "frac" % "1.1.2-7403b6",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "printj" % "1.1.2-749e24",
  "com.scalablytyped" %%% "ssf" % "0.10.2-8381d5",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        