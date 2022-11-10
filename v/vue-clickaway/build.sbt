organization := "org.scalablytyped"
name := "vue-clickaway"
version := "2.2-dt-20211202Z-fdcff7"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-97fb28",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-2e222a",
  "org.scalablytyped" %%% "csstype" % "3.1.1-f779a1",
  "org.scalablytyped" %%% "source-map" % "0.7.4-114bc3",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "vue" % "3.2.44-ea8928",
  "org.scalablytyped" %%% "vue__compiler-core" % "3.2.44-bd7f3f",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.44-4ce39a",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.44-b59ec8",
  "org.scalablytyped" %%% "vue__runtime-dom" % "3.2.44-214b60",
  "org.scalablytyped" %%% "vue__shared" % "3.2.44-7c9b23")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
