organization := "org.scalablytyped"
name := "vue-select"
version := "3.16-dt-20220823Z-ef7b5b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.44-4ce39a",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.44-b59ec8",
  "org.scalablytyped" %%% "vue__shared" % "3.2.44-7c9b23")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
