organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20180731Z-328531"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-865309",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190211Z-7e763d",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-db8310",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190227Z-56553a",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190225Z-a2015c",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20190227Z-c0b137",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "validator" % "v10.9.0-dt-20181214Z-00f36e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        