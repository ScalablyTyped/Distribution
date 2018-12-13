organization := "org.scalablytyped"
name := "temp-file"
version := "3.3.2-8c448e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-b88fdf",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-460360",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-f3b2ad",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-c8e76c",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        