organization := "com.scalablytyped"
name := "winston"
version := "3.1.0-07cc5d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "async" % "2.0.1-dt-20181020Z-4e17a5",
  "com.scalablytyped" %%% "is-stream" % "1.1-dt-20180910Z-793f94",
  "com.scalablytyped" %%% "logform" % "1.2-dt-20180910Z-c65ab9",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180910Z-9bfd99",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "triple-beam" % "1.3-dt-20180910Z-3c3247",
  "com.scalablytyped" %%% "winston-transport" % "4.2.0-e87aa3",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        