organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20180910Z-dd18ff"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181214Z-21934a",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180910Z-e19db4",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20180910Z-95ff3c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-17fe49",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20181203Z-47ec07",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20181211Z-a4f051",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "validator" % "v9.4-dt-20181213Z-5a5287")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        