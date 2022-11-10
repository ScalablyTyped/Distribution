organization := "org.scalablytyped"
name := "x-ray"
version := "2.3-dt-20211202Z-b9b613"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20211202Z-ea3ef3",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20221103Z-6d7ec9",
  "org.scalablytyped" %%% "http-context" % "1.1-dt-20211202Z-e39257",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "x-ray-crawler" % "2.0-dt-20211202Z-c18b46")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
