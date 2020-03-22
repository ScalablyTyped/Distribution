organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20200204Z-848803"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-2fc7af",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20191119Z-82493a",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20191223Z-05cc06",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20200130Z-8af6d1",
  "org.scalablytyped" %%% "mongodb" % "3.3-dt-20200210Z-929a5d",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20191125Z-c8c316",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "validator" % "12.0-dt-20191226Z-cee9bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
