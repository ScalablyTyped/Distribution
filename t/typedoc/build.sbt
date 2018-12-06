organization := "org.scalablytyped"
name := "typedoc"
version := "0.13.0-90e235"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-2e2a60",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-63ba70",
  "org.scalablytyped" %%% "handlebars" % "v4.0.11-dt-20180910Z-c8f5b5",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180910Z-8ca28c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-3dc8be",
  "org.scalablytyped" %%% "marked" % "0.5-dt-20181204Z-2f16ef",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-4563df",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "progress" % "v2.0.0-dt-20180910Z-c58db2",
  "org.scalablytyped" %%% "shelljs" % "0.8-dt-20181206Z-7a42c0",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "typescript" % "3.2.1-a03537")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        