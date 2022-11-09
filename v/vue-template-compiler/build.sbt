organization := "org.scalablytyped"
name := "vue-template-compiler"
version := "2.7.13-deb460"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.42-e349d3",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.42-07dc53",
  "org.scalablytyped" %%% "vue__shared" % "3.2.42-ead2ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
