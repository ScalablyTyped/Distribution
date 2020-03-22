organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20200227Z-3c753a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20200302Z-2fc7af",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20200319Z-8ab6dd",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20200225Z-d06eb6",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20200302Z-8af6d1",
  "org.scalablytyped" %%% "mongodb" % "3.5-dt-20200305Z-955b8a",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20200225Z-04cf97",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "validator" % "12.0-dt-20191226Z-cee9bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
