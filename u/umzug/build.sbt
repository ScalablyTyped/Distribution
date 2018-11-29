organization := "com.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20180910Z-e393b9"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-7bd99a",
  "com.scalablytyped" %%% "bson" % "1.0.6-dt-20180910Z-f48efd",
  "com.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20180910Z-c954ca",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-aa3127",
  "com.scalablytyped" %%% "mongodb" % "v3.1-dt-20181128Z-371dbd",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "sequelize" % "4.27.10-dt-20181128Z-7da2bb",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "validator" % "v9.4-dt-20181116Z-1f35af",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        