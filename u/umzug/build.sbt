organization := "org.scalablytyped"
name := "umzug"
version := "v2.3.0-dt-20201013Z-22a371"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20201028Z-86bb8c",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20201020Z-339808",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20201002Z-57cd99",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20201105Z-7a57e4",
  "org.scalablytyped" %%% "mongodb" % "3.5-dt-20201120Z-7e7d00",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20201002Z-8069db",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "validator" % "13.1-dt-20200624Z-a5fd37")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
