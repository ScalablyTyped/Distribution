organization := "org.scalablytyped"
name := "ts-node"
version := "7.0.1-450d87"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-56c0cd",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180616Z-620598",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190129Z-6c91bf",
  "org.scalablytyped" %%% "make-error" % "1.3.5-438a4b",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-b5ce4c",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-e36770",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "source-map-support" % "0.5-dt-20190224Z-7ff9df",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "typescript" % "3.3.3333-09c87f",
  "org.scalablytyped" %%% "yn" % "3.0-dt-20190117Z-1e9b47")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        