organization := "org.scalablytyped"
name := "yeoman-generator"
version := "5.2-dt-20220815Z-1b6356"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-00fd1d",
  "org.scalablytyped" %%% "ejs" % "3.1-dt-20220624Z-36fd73",
  "org.scalablytyped" %%% "glob" % "8.0-dt-20220830Z-8678ad",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20221107Z-ae4035",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-6d1302",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20211202Z-6e6b4b",
  "org.scalablytyped" %%% "mem-fs-editor" % "7.0-dt-20220624Z-4ef9f5",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-b63e37",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-c5fb11",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-fec6f6",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-91b38e",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20221107Z-04e4a3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
