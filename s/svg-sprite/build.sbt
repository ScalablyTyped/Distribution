organization := "org.scalablytyped"
name := "svg-sprite"
version := "0.0-unknown-dt-20181018Z-a8e7e8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181020Z-6d9978",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180910Z-1c5e76",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180910Z-3326eb",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180910Z-dfb439",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180910Z-c053bc",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20180910Z-816b63",
  "org.scalablytyped" %%% "winston" % "3.1.0-bd9907",
  "org.scalablytyped" %%% "winston-transport" % "4.2.0-f2dd96")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        