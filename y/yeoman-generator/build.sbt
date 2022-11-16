organization := "org.scalablytyped"
name := "yeoman-generator"
version := "5.2-dt-20220815Z-286449"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-46fecc",
  "org.scalablytyped" %%% "ejs" % "3.1-dt-20220624Z-d80e4a",
  "org.scalablytyped" %%% "glob" % "8.0-dt-20220830Z-d5113e",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20221107Z-84bcc0",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-fdd79d",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20211202Z-ed6e4f",
  "org.scalablytyped" %%% "mem-fs-editor" % "7.0-dt-20220624Z-705c38",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-7e6dc6",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-c5fb11",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-2ac93e",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-48adf0",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20221107Z-985447")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
