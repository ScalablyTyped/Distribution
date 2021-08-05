organization := "org.scalablytyped"
name := "yeoman-test"
version := "2.0-dt-20201016Z-0fdae3"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-64e7b3",
  "org.scalablytyped" %%% "ejs" % "3.0-dt-20201020Z-16fd69",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200706Z-623eaa",
  "org.scalablytyped" %%% "inquirer" % "7.3-dt-20200820Z-0d2080",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20200831Z-bfbda9",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-49b660",
  "org.scalablytyped" %%% "mem-fs-editor" % "7.0-dt-20200707Z-f93b2f",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200515Z-c7d5c6",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "rxjs" % "6.6.3-fc5d55",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.3-b1ecae",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20201002Z-ad47f2",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20201002Z-85853c",
  "org.scalablytyped" %%% "yeoman-generator" % "4.11-dt-20201016Z-e79a03")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
