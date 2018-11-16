organization := "com.scalablytyped"
name := "typedoc"
version := "0.13.0-182b2e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "fs-extra" % "5.0-dt-20181102Z-49c518",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20181102Z-ea59e6",
  "com.scalablytyped" %%% "handlebars" % "v4.0.11-dt-20181102Z-174552",
  "com.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20181102Z-23f9b6",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181109Z-67570f",
  "com.scalablytyped" %%% "marked" % "0.4-dt-20181102Z-5d74d4",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20181102Z-8447c6",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "progress" % "v2.0.0-dt-20181102Z-92dac9",
  "com.scalablytyped" %%% "shelljs" % "0.8-dt-20181102Z-8cd2fc",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "typescript" % "3.1.6-0ff591",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        