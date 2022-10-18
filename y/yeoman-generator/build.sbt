organization := "org.scalablytyped"
name := "yeoman-generator"
version := "5.2-dt-20220815Z-d15ec0"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-d881d1",
  "org.scalablytyped" %%% "ejs" % "3.1-dt-20220624Z-86caaa",
  "org.scalablytyped" %%% "glob" % "8.0-dt-20220830Z-50aea4",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20220928Z-5cd749",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-58e21d",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20211202Z-0aff25",
  "org.scalablytyped" %%% "mem-fs-editor" % "7.0-dt-20220624Z-d98d4f",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-374fcc",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-0be45f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-0dd117",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-d9ee56",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20220819Z-274b35")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
