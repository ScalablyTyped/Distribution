organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20190524Z-ca7039"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-d528a7",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20191119Z-797f68",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20191223Z-8cac26",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191126Z-7b0fe5",
  "org.scalablytyped" %%% "mongodb" % "3.3-dt-20191223Z-07bf04",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20191125Z-16962e",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "validator" % "12.0-dt-20191226Z-3ab010")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        