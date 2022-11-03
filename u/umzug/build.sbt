organization := "org.scalablytyped"
name := "umzug"
version := "v2.3.0-dt-20220818Z-30ffc0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20221103Z-5a7a5b",
  "org.scalablytyped" %%% "bson" % "4.7.0-8f1d87",
  "org.scalablytyped" %%% "buffer" % "6.0.3-f5a9ba",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20211223Z-9f7a21",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20221101Z-8725a4",
  "org.scalablytyped" %%% "mongodb" % "4.11.0-c9f522",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20220819Z-d4267d",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "validator" % "13.7-dt-20221030Z-1cab63")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
