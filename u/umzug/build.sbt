organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20190524Z-062d74"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191014Z-44f16d",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-8fa8e7",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20190813Z-ee6741",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191107Z-8f9b3f",
  "org.scalablytyped" %%% "mongodb" % "3.3-dt-20191101Z-0d6067",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191105Z-2397f3",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20191014Z-917671",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190819Z-d0446a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        