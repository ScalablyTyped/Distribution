organization := "org.scalablytyped"
name := "vue"
version := "3.2.42-b9b762"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-021aec",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-5a1686",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "source-map" % "0.7.4-01a3bb",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "vue__compiler-core" % "3.2.42-74700c",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.42-e349d3",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.42-07dc53",
  "org.scalablytyped" %%% "vue__runtime-dom" % "3.2.42-bec3f6",
  "org.scalablytyped" %%% "vue__shared" % "3.2.42-ead2ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
