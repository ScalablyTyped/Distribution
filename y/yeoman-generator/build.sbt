organization := "org.scalablytyped"
name := "yeoman-generator"
version := "5.2-dt-20220815Z-aea3b3"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-139f7f",
  "org.scalablytyped" %%% "ejs" % "3.1-dt-20220624Z-00c1d8",
  "org.scalablytyped" %%% "glob" % "8.0-dt-20220830Z-c57dc0",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20220815Z-523527",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-aaec85",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20211202Z-61bcc1",
  "org.scalablytyped" %%% "mem-fs-editor" % "7.0-dt-20220624Z-36a6a9",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-a8ea5b",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-0be45f",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-e5e6c8",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20220819Z-8e3b69")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
