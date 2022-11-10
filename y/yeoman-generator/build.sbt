organization := "org.scalablytyped"
name := "yeoman-generator"
version := "5.2-dt-20220815Z-cf37bd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-03d2f5",
  "org.scalablytyped" %%% "ejs" % "3.1-dt-20220624Z-736ddb",
  "org.scalablytyped" %%% "glob" % "8.0-dt-20220830Z-dbe92e",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20221107Z-18de73",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-aa50bf",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20211202Z-685b7b",
  "org.scalablytyped" %%% "mem-fs-editor" % "7.0-dt-20220624Z-c4d7dc",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-25b5f6",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-bb1d3f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-9dc6db",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-c2d69f",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20221107Z-e54af9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
