organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20190524Z-90d32f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191014Z-347560",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-000985",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20190813Z-ade357",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191009Z-45ddf4",
  "org.scalablytyped" %%% "mongodb" % "3.3-dt-20191007Z-04ea06",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191015Z-4f243e",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20191014Z-a34941",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190819Z-046ba6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        