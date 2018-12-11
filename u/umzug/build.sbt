organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20180910Z-f32bbc"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-b88fdf",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180910Z-07effb",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20180910Z-ee92fd",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20181203Z-987a62",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20181211Z-5ccc07",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "validator" % "v9.4-dt-20181116Z-8027a8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        