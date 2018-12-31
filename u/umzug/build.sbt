organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20180731Z-b95c2d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-03fd26",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180721Z-47f88b",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-2bc1a6",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-0a02fb",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20181223Z-9610e2",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20181210Z-0b2fc5",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "validator" % "v10.9.0-dt-20181214Z-89e70a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        