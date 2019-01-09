organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20180731Z-dea55c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-a33d29",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180721Z-87cf06",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-e3bcd8",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-010a28",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20181223Z-0d9d77",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20181210Z-d8724b",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "validator" % "v10.9.0-dt-20181214Z-7a5820")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        