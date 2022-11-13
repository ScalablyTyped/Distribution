organization := "org.scalablytyped"
name := "vue__test-utils"
version := "2.2.2-336808"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-97fb28",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-2e222a",
  "org.scalablytyped" %%% "csstype" % "3.1.1-f779a1",
  "org.scalablytyped" %%% "source-map" % "0.7.4-114bc3",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "vue" % "3.2.45-d93ea3",
  "org.scalablytyped" %%% "vue__compiler-core" % "3.2.45-d8ef2e",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.45-9276fd",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.45-b92a42",
  "org.scalablytyped" %%% "vue__runtime-dom" % "3.2.45-9a61bf",
  "org.scalablytyped" %%% "vue__shared" % "3.2.45-f2d292")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
