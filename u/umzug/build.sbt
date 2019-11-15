organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20190524Z-4d4f3c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-35b9bf",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-fa6818",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20190813Z-6f37dd",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191113Z-c322f2",
  "org.scalablytyped" %%% "mongodb" % "3.3-dt-20191108Z-d64b40",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191108Z-6cbaae",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20191014Z-4e1e06",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190819Z-d0446a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        