organization := "org.scalablytyped"
name := "ts-node"
version := "7.0.1-8a9e06"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180910Z-4c03df",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180910Z-f9199f",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181105Z-7260ba",
  "org.scalablytyped" %%% "make-error" % "1.3.5-15f803",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-18660e",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180910Z-a2e6b0",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-d1333e",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "typescript" % "3.2.2-fe9cc4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        