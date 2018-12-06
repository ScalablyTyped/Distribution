organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20180910Z-cf9fbb"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-3eb23e",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180910Z-6478ed",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20180910Z-9275c0",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-3dc8be",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20181203Z-200d30",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "sequelize" % "4.27.10-dt-20181128Z-7241d8",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "validator" % "v9.4-dt-20181116Z-cffe9d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        