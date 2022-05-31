organization := "org.scalablytyped"
name := "umzug"
version := "v2.3.0-dt-20201013Z-abb3c3"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20201028Z-8f0838",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20201020Z-a1f444",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20201002Z-54b202",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20201105Z-a2958c",
  "org.scalablytyped" %%% "mongodb" % "3.5-dt-20201120Z-84a65f",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20201002Z-aff8dc",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "validator" % "13.1-dt-20200624Z-9d2024")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
