organization := "org.scalablytyped"
name := "ts-node"
version := "7.0.1-cccca8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180910Z-904d61",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180910Z-08d7ed",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181105Z-0025b6",
  "org.scalablytyped" %%% "make-error" % "1.3.5-7273db",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-231fe7",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180910Z-0a7381",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-762bad",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "typescript" % "3.2.1-a03537")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        