organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20190411Z-66a424"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-aac16e",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-af9d88",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-5af94a",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190510Z-5e7cae",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190501Z-ff0a27",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190513Z-e9c6e7",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20190513Z-5f34df",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190329Z-3ec364")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        