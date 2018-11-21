organization := "com.scalablytyped"
name := "svg-sprite"
version := "0.0-unknown-dt-20181018Z-a1614c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "async" % "2.0.1-dt-20181020Z-4e61c0",
  "com.scalablytyped" %%% "is-stream" % "1.1-dt-20180910Z-4f5489",
  "com.scalablytyped" %%% "logform" % "1.2-dt-20180910Z-9d5b62",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-cadd20",
  "com.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180910Z-d3ba3d",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "triple-beam" % "1.3-dt-20180910Z-60e569",
  "com.scalablytyped" %%% "vinyl" % "2.0-dt-20180910Z-c07af2",
  "com.scalablytyped" %%% "winston" % "3.1.0-beb718",
  "com.scalablytyped" %%% "winston-transport" % "4.2.0-5f641b",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        