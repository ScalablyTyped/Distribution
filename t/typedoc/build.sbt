organization := "org.scalablytyped"
name := "typedoc"
version := "0.14.2-554860"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-cb3aae",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-105e95",
  "org.scalablytyped" %%% "handlebars" % "v4.0.11-dt-20181213Z-99db49",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180214Z-a89a22",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-f3a537",
  "org.scalablytyped" %%% "marked" % "0.6-dt-20190212Z-d204a1",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-8c05a2",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20181213Z-65e57e",
  "org.scalablytyped" %%% "shelljs" % "0.8-dt-20190212Z-3dde47",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "typescript" % "3.3.3333-5c20b0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        