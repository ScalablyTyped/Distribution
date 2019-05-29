organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20190524Z-04cdb8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-d0c235",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-2a8886",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-3eea13",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190523Z-e414eb",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190515Z-e7e1ac",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20190524Z-992d3a",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190329Z-1395ee")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        