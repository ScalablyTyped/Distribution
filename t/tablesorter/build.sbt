organization := "org.scalablytyped"
name := "tablesorter"
version := "2.31-dt-20211202Z-fde893"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20221103Z-3c04f1",
  "org.scalablytyped" %%% "globalize" % "1.5-dt-20211202Z-988073",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20221103Z-33f6f2",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20211202Z-4ced9f",
  "org.scalablytyped" %%% "select2" % "4.0-dt-20220127Z-247b64",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-62291b",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
