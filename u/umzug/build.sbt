organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20190524Z-ac07d7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-462670",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-92e9c9",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-fde67f",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190531Z-4abba9",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190531Z-456094",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190605Z-895d8c",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20190530Z-fe757b",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190329Z-03f8ef")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        