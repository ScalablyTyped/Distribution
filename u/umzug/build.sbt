organization := "com.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20180910Z-147dfe"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-3124ce",
  "com.scalablytyped" %%% "bson" % "1.0.6-dt-20180910Z-e26797",
  "com.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20180910Z-56ed83",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-caf0c5",
  "com.scalablytyped" %%% "mongodb" % "v3.1-dt-20181028Z-9b8ad0",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-5a910f",
  "com.scalablytyped" %%% "sequelize" % "4.27.10-dt-20181120Z-e6ed24",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "validator" % "v9.4-dt-20181116Z-42525f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        