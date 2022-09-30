organization := "org.scalablytyped"
name := "umzug"
version := "v2.3.0-dt-20220818Z-9368bc"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20220923Z-c67867",
  "org.scalablytyped" %%% "bson" % "4.7.0-72ef1c",
  "org.scalablytyped" %%% "buffer" % "6.0.3-3c44f1",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20211223Z-a76c54",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20220928Z-c0791d",
  "org.scalablytyped" %%% "mongodb" % "4.10.0-06b109",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20220819Z-2f5092",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "validator" % "13.7-dt-20220924Z-afc019")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
