organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20190524Z-fee16b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191014Z-347560",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-a22cb2",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20190813Z-5e8ffa",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191009Z-45ddf4",
  "org.scalablytyped" %%% "mongodb" % "3.3-dt-20191029Z-42ff67",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191030Z-4bf573",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20191014Z-7c2c5b",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190819Z-046ba6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        