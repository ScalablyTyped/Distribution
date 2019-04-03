organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20190322Z-c3bf85"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-986805",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-b53f76",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-725ef8",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-69a948",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190307Z-fa9803",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20190330Z-057ca5",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190329Z-5459d8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        