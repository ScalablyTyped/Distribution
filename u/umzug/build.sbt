organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20180731Z-194c3d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-f01776",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180721Z-141ca5",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-a84fc1",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-cf3a73",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20190110Z-c008a8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20190116Z-c29e1b",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "validator" % "v10.9.0-dt-20181214Z-93e6e9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        