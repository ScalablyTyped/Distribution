organization := "org.scalablytyped"
name := "ts-node"
version := "7.0.1-90ac46"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-5b0dde",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180616Z-75f405",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190129Z-4b83ac",
  "org.scalablytyped" %%% "make-error" % "1.3.5-f3ac28",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-5de375",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-3cef84",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20190212Z-adb224",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "typescript" % "3.3.3333-4b18ce",
  "org.scalablytyped" %%% "yn" % "3.0-dt-20190117Z-6050bd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        