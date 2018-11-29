organization := "com.scalablytyped"
name := "windows-script-host"
version := "5.8-dt-20180910Z-c82936"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "activex-interop" % "0.0-dt-20180910Z-0bc3c4",
  "com.scalablytyped" %%% "activex-iwshruntimelibrary" % "0.0-dt-20180910Z-fb5b85",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        