organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20190524Z-a3d05e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-1ea477",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-5b46fa",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-1492ac",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190626Z-4ba0df",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190531Z-d3ff34",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190621Z-8f9d23",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20190530Z-2fd830",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190608Z-b83a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        