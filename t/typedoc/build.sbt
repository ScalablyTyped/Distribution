organization := "org.scalablytyped"
name := "typedoc"
version := "0.13.0-b8fa16"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-57e2a1",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-82c87b",
  "org.scalablytyped" %%% "handlebars" % "v4.0.11-dt-20180910Z-7e5619",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180910Z-672f23",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-e3741e",
  "org.scalablytyped" %%% "marked" % "0.5-dt-20181204Z-c3c7e7",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-937a94",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "progress" % "v2.0.0-dt-20180910Z-8a8b1c",
  "org.scalablytyped" %%% "shelljs" % "0.8-dt-20181206Z-aa7a83",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "typescript" % "3.2.2-fe9cc4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        