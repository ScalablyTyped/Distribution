organization := "org.scalablytyped"
name := "ts-node"
version := "7.0.1-dcfee1"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180910Z-8cd3e7",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180910Z-7635c0",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181105Z-eeb72f",
  "org.scalablytyped" %%% "make-error" % "1.3.5-70f813",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-aae1f0",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180910Z-ca7068",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-fbdddb",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "typescript" % "3.2.2-445e51")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        