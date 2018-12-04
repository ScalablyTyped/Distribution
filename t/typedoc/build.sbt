organization := "com.scalablytyped"
name := "typedoc"
version := "0.13.0-1e3189"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-2537fe",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-b89aff",
  "com.scalablytyped" %%% "handlebars" % "v4.0.11-dt-20180910Z-fbb0f9",
  "com.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180910Z-2a9bdb",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-0335c2",
  "com.scalablytyped" %%% "marked" % "0.5-dt-20181204Z-1f52af",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-5ec0b9",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "progress" % "v2.0.0-dt-20180910Z-2fded1",
  "com.scalablytyped" %%% "shelljs" % "0.8-dt-20181121Z-ad1461",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "typescript" % "3.2.1-5cd657",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        