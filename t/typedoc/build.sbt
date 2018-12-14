organization := "org.scalablytyped"
name := "typedoc"
version := "0.13.0-92b351"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-ffc598",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-a33ba6",
  "org.scalablytyped" %%% "handlebars" % "v4.0.11-dt-20180910Z-30813f",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180910Z-bebe09",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "marked" % "0.5-dt-20181204Z-6822f0",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-45414c",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-21ad57",
  "org.scalablytyped" %%% "progress" % "v2.0.0-dt-20181211Z-d9b01a",
  "org.scalablytyped" %%% "shelljs" % "0.8-dt-20181206Z-a46650",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "typescript" % "3.2.2-445e51")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        