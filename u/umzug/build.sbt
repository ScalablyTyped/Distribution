organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20190411Z-2aca74"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-e9bc8b",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-0c2362",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-cdef55",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-ea402e",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190422Z-4fd34e",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190426Z-d35e72",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20190412Z-d2b700",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190329Z-da95e8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        