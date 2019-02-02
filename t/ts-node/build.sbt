organization := "org.scalablytyped"
name := "ts-node"
version := "7.0.1-bd3494"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-e71a1f",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180616Z-b12ca9",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190129Z-642a22",
  "org.scalablytyped" %%% "make-error" % "1.3.5-c9f607",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-94b6ad",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-bb0665",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-0f4428",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "typescript" % "3.3.1-b7b6b0",
  "org.scalablytyped" %%% "yn" % "3.0-dt-20190117Z-559b79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        