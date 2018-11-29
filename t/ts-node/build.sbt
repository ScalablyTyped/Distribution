organization := "com.scalablytyped"
name := "ts-node"
version := "7.0.1-d7386b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "arrify" % "1.0-dt-20180910Z-e99df0",
  "com.scalablytyped" %%% "buffer-from" % "1.1-dt-20180910Z-ad6a3b",
  "com.scalablytyped" %%% "diff" % "3.5-dt-20181105Z-0d6c56",
  "com.scalablytyped" %%% "make-error" % "1.3.5-6eda38",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-a475cc",
  "com.scalablytyped" %%% "mkdirp" % "0.5-dt-20180910Z-697e07",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-56237b",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "typescript" % "3.2.1-5cd657",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        