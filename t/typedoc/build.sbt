organization := "org.scalablytyped"
name := "typedoc"
version := "0.13.0-1b6676"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-9e8f6d",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-790699",
  "org.scalablytyped" %%% "handlebars" % "v4.0.11-dt-20181213Z-e84eec",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180214Z-8085bb",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-b7dcf8",
  "org.scalablytyped" %%% "marked" % "0.5-dt-20181204Z-0eb4e1",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-7791d7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20181213Z-9b4ac8",
  "org.scalablytyped" %%% "shelljs" % "0.8-dt-20181206Z-9caf2d",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "typescript" % "3.2.2-c77b02")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        