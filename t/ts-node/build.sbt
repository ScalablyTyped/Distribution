organization := "org.scalablytyped"
name := "ts-node"
version := "7.0.1-df3b60"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-fb83b6",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180616Z-30e7dd",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190129Z-499eae",
  "org.scalablytyped" %%% "make-error" % "1.3.5-b64156",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-e2a650",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-841555",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20190212Z-efb777",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "typescript" % "3.3.3333-5c20b0",
  "org.scalablytyped" %%% "yn" % "3.0-dt-20190117Z-30dc82")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        