organization := "org.scalablytyped"
name := "testing-library__vue"
version := "7.0.0-415a09"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aria-query" % "5.0-dt-20221027Z-94ebf8",
  "org.scalablytyped" %%% "babel__parser" % "7.21.8-43580a",
  "org.scalablytyped" %%% "babel__types" % "7.21.5-fbdd8a",
  "org.scalablytyped" %%% "csstype" % "3.1.2-5927f3",
  "org.scalablytyped" %%% "pretty-format" % "29.5.0-e0482b",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-781ad1",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "testing-library__dom" % "9.3.0-8987e1",
  "org.scalablytyped" %%% "vue" % "3.3.2-37424c",
  "org.scalablytyped" %%% "vue__compiler-core" % "3.3.2-4ed765",
  "org.scalablytyped" %%% "vue__reactivity" % "3.3.2-725762",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.3.2-b7cace",
  "org.scalablytyped" %%% "vue__runtime-dom" % "3.3.2-2e725b",
  "org.scalablytyped" %%% "vue__shared" % "3.3.2-d52317",
  "org.scalablytyped" %%% "vue__test-utils" % "2.3.2-148dfd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
