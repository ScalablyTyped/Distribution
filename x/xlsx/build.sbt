organization := "org.scalablytyped"
name := "xlsx"
version := "0.14.1-c45deb"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adler-32" % "1.2.0-cfd3ff",
  "org.scalablytyped" %%% "cfb" % "1.1.0-08e829",
  "org.scalablytyped" %%% "codepage" % "1.14.0-83a5b8",
  "org.scalablytyped" %%% "commander" % "2.19.0-5e90f1",
  "org.scalablytyped" %%% "crc-32" % "1.2.0-b15bf9",
  "org.scalablytyped" %%% "frac" % "1.1.2-f751b8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "printj" % "1.1.2-d1c011",
  "org.scalablytyped" %%% "ssf" % "0.10.2-ed5465",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        