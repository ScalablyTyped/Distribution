organization := "org.scalablytyped"
name := "yeoman-generator"
version := "4.11-dt-20201016Z-d31eb3"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-939b6e",
  "org.scalablytyped" %%% "ejs" % "3.0-dt-20201020Z-886519",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200706Z-de8bc7",
  "org.scalablytyped" %%% "inquirer" % "7.3-dt-20200820Z-2d7140",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20200831Z-ad71af",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-1b51c0",
  "org.scalablytyped" %%% "mem-fs-editor" % "7.0-dt-20200707Z-56ddc1",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200515Z-e93439",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "rxjs" % "6.6.3-e772da",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.3-e1471b",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20201002Z-81a546",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20201002Z-34a471")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
