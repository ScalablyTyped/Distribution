organization := "org.scalablytyped"
name := "windows-script-host"
version := "5.8-dt-20180529Z-87cb18"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20180721Z-e6877b",
  "org.scalablytyped" %%% "activex-iwshruntimelibrary" % "0.0-dt-20180529Z-b890cc",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        