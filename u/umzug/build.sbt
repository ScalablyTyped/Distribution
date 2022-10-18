organization := "org.scalablytyped"
name := "umzug"
version := "v2.3.0-dt-20220818Z-a929a7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20220923Z-463b2d",
  "org.scalablytyped" %%% "bson" % "4.7.0-7824ee",
  "org.scalablytyped" %%% "buffer" % "6.0.3-6a53bb",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20211223Z-bcf397",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20220928Z-cacacb",
  "org.scalablytyped" %%% "mongodb" % "4.10.0-dcc71c",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20220819Z-9c354a",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "validator" % "13.7-dt-20221015Z-d25a94")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
