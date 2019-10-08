organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20190524Z-a6182f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-0961f2",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-65ecda",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20190813Z-070cb8",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191007Z-55b53c",
  "org.scalablytyped" %%% "mongodb" % "3.3-dt-20191007Z-2cb924",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-a35ed6",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20190927Z-d2258d",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190819Z-4e8943")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        