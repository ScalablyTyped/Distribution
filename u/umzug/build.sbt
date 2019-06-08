organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20190524Z-4a4c98"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-462670",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-db0a80",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-d1f67c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190606Z-4abba9",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190531Z-ac723c",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190606Z-b7fe68",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20190530Z-5ac683",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190608Z-58df53")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        