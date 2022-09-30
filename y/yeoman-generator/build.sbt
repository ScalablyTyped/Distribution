organization := "org.scalablytyped"
name := "yeoman-generator"
version := "5.2-dt-20220815Z-acad81"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-96a1cd",
  "org.scalablytyped" %%% "ejs" % "3.1-dt-20220624Z-fff9de",
  "org.scalablytyped" %%% "glob" % "8.0-dt-20220830Z-eec4ba",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20220928Z-52b1ed",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-fff97a",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20211202Z-57ff91",
  "org.scalablytyped" %%% "mem-fs-editor" % "7.0-dt-20220624Z-1ad6fc",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-84ae38",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-0be45f",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-bafe80",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20220819Z-ff96b7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
