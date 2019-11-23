organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20190524Z-308e47"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-35b9bf",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20191119Z-e38ee9",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20190813Z-e322ae",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191118Z-0a5f57",
  "org.scalablytyped" %%% "mongodb" % "3.3-dt-20191118Z-fbb478",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-304e79",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20191118Z-d57ea4",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "validator" % "12.0-dt-20191118Z-4ab4cb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        