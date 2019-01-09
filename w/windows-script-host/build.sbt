organization := "org.scalablytyped"
name := "windows-script-host"
version := "5.8-dt-20180529Z-6b8bed"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20180721Z-c71a8d",
  "org.scalablytyped" %%% "activex-iwshruntimelibrary" % "0.0-dt-20180529Z-ec186f",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        