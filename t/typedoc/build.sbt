organization := "org.scalablytyped"
name := "typedoc"
version := "0.14.2-dc8ae2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-948114",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-e30bdd",
  "org.scalablytyped" %%% "handlebars" % "v4.0.11-dt-20181213Z-b56f47",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180214Z-b2d4d0",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-cf3a73",
  "org.scalablytyped" %%% "marked" % "0.6-dt-20190102Z-216b98",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-029f0e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20181213Z-26a56a",
  "org.scalablytyped" %%% "shelljs" % "0.8-dt-20190125Z-ffd886",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "typescript" % "3.3.1-9debc0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        