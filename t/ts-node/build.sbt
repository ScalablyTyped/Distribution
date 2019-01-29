organization := "org.scalablytyped"
name := "ts-node"
version := "7.0.1-299a17"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-a40bdc",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180616Z-451d16",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190121Z-ec63f0",
  "org.scalablytyped" %%% "make-error" % "1.3.5-f18f71",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-fff6c3",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-28c4a1",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-444403",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "typescript" % "3.2.4-3dde35",
  "org.scalablytyped" %%% "yn" % "3.0-dt-20190117Z-8e0386")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        