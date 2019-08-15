organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20190524Z-92cc41"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-2c5248",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-07a552",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20190813Z-20d6c1",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190708Z-370309",
  "org.scalablytyped" %%% "mongodb" % "3.2-dt-20190814Z-08db22",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-317602",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20190722Z-052038",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190723Z-92da09")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        