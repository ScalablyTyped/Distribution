organization := "com.scalablytyped"
name := "virtual-keyboard"
version := "1.26-dt-20181102Z-593d79"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "jquery" % "3.3-dt-20181102Z-ef9974",
  "com.scalablytyped" %%% "sizzle" % "2.3-dt-20181102Z-6214b8",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        