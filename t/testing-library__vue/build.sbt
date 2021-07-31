organization := "org.scalablytyped"
name := "testing-library__vue"
version := "5.0-dt-20200723Z-b8a8aa"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aria-query" % "4.2-dt-20200628Z-1b5d95",
  "org.scalablytyped" %%% "pretty-format" % "26.6.2-c6cc5e",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "testing-library__dom" % "7.28.1-50c147",
  "org.scalablytyped" %%% "vue" % "2.6.12-d4c5c7",
  "org.scalablytyped" %%% "vue-router" % "3.4.9-da31e7",
  "org.scalablytyped" %%% "vue__test-utils" % "1.1.1-8a59e3",
  "org.scalablytyped" %%% "vuex" % "3.5.1-5e9c02")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
