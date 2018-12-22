organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20180731Z-5a2e7f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-8f594d",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180721Z-d496ac",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-8e27cb",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-b7dcf8",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20181203Z-899288",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20181210Z-3c8a5a",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "validator" % "v10.9.0-dt-20181214Z-d3a3c6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        