organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20200515Z-a20020"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20200520Z-17bf41",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20200515Z-0f4d1f",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20200515Z-c4eb92",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20200624Z-697568",
  "org.scalablytyped" %%% "mongodb" % "3.5-dt-20200624Z-a3bcbe",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20200515Z-278f19",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "validator" % "13.1-dt-20200624Z-80544e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
