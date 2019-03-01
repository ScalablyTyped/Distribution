organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20180731Z-67d423"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-cbbf17",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190211Z-b837e2",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-1ea83a",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-f3a537",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20190110Z-222ecc",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20190227Z-36320d",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "validator" % "v10.9.0-dt-20181214Z-3a092c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        