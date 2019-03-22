organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20180731Z-05c674"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-cc7043",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190211Z-f3c48c",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-407f14",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190307Z-403da2",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190320Z-26b6b7",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20190313Z-57bde5",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "validator" % "v10.9.0-dt-20181214Z-4bd2ae")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        