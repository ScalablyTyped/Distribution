organization := "org.scalablytyped"
name := "vue__server-renderer"
version := "3.2.41-37b5a9"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.41-669f2b",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.41-c55f63",
  "org.scalablytyped" %%% "vue__shared" % "3.2.41-1967a8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
