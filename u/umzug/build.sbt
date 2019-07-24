organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20190524Z-782e9b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-aebf09",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-cfea70",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-7cde73",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190708Z-b8e808",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190723Z-e0bfc7",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190717Z-e46800",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20190722Z-ae3a50",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190723Z-a6426c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        