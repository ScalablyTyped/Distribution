organization := "org.scalablytyped"
name := "ts-node"
version := "7.0.1-f0e0f9"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180910Z-8cd3e7",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180910Z-04210e",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181105Z-eeb72f",
  "org.scalablytyped" %%% "make-error" % "1.3.5-70f813",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-aae1f0",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180910Z-9d5a07",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-3d192b",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "typescript" % "3.2.2-445e51")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        