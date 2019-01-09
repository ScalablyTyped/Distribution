organization := "org.scalablytyped"
name := "ts-node"
version := "7.0.1-56b257"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-7e672d",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180616Z-9a9f6b",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181102Z-4cfaa6",
  "org.scalablytyped" %%% "make-error" % "1.3.5-fcfd33",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-86ee84",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-00cb09",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-a3e4d1",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "typescript" % "3.2.2-12aee5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        