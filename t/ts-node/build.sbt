organization := "com.scalablytyped"
name := "ts-node"
version := "7.0.1-6c6c8a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "arrify" % "1.0-dt-20180910Z-acd933",
  "com.scalablytyped" %%% "buffer-from" % "1.1-dt-20180910Z-f0c552",
  "com.scalablytyped" %%% "diff" % "3.5-dt-20181105Z-9d1bfa",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "make-error" % "1.3.5-c3f304",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-dd566d",
  "com.scalablytyped" %%% "mkdirp" % "0.5-dt-20180910Z-8f6e1d",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-edffa1",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "typescript" % "3.1.3-c44b5f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        