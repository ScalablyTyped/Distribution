organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20180731Z-c2ebbc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-f01776",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180721Z-2fdc37",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-e2a96a",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-cf3a73",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20190110Z-e5665e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-9f73ab",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20190201Z-f037f6",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "validator" % "v10.9.0-dt-20181214Z-93e6e9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        