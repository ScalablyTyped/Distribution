organization := "org.scalablytyped"
name := "yeoman-generator"
version := "5.2-dt-20220815Z-5f47dc"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-f1b33e",
  "org.scalablytyped" %%% "ejs" % "3.1-dt-20230214Z-b9f11f",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20230308Z-d2c172",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-c415ea",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20211202Z-6fbc3d",
  "org.scalablytyped" %%% "mem-fs-editor" % "7.0-dt-20230412Z-a35fc4",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-d75a3b",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "rxjs" % "7.8.1-1301bf",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-bead07",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20221107Z-fbd7c2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
