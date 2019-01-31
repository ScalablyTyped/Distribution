organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20180731Z-c1909a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-ef7d03",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180721Z-2b9c51",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-e61988",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-e5b16b",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20190110Z-3102b3",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20190116Z-8b994e",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "validator" % "v10.9.0-dt-20181214Z-b0f322")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        