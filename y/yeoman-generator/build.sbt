organization := "org.scalablytyped"
name := "yeoman-generator"
version := "5.2-dt-20220815Z-525348"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-6dfedf",
  "org.scalablytyped" %%% "ejs" % "3.1-dt-20220624Z-0c8dfb",
  "org.scalablytyped" %%% "glob" % "8.0-dt-20220830Z-ce978f",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20220928Z-898b9b",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-349280",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20211202Z-1f46c3",
  "org.scalablytyped" %%% "mem-fs-editor" % "7.0-dt-20220624Z-3da5d7",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-19e0f3",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-bb1d3f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-a78fa8",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-501e6d",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20220819Z-95b2b5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
