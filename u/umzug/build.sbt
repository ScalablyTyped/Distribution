organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20190322Z-6e9653"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-d754c7",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-4f8d8d",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-4e7bf6",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-7a74e5",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190307Z-59ff8d",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20190322Z-afecb4",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "validator" % "v10.9.0-dt-20190322Z-0a92cb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        