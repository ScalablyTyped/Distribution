organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20180731Z-b4554d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-cc7043",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190211Z-3349bf",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-d23299",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190307Z-523a14",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190311Z-8b4969",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20190307Z-d80e9b",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "validator" % "v10.9.0-dt-20181214Z-4bd2ae")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        