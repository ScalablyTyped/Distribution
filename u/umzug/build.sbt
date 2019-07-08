organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20190524Z-829c25"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-aebf09",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-5108ae",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-d329b4",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190626Z-08a773",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190531Z-4fd308",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-a67e53",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20190530Z-cce7cb",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190608Z-1509b3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        