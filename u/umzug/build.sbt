organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20190524Z-f5962a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-e943e4",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-db4d7e",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-c03a8d",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190523Z-5e7cae",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190515Z-950532",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-07594f",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20190524Z-5a23a4",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190329Z-3ec364")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        