organization := "org.scalablytyped"
name := "vue-the-mask"
version := "0.11-dt-20211202Z-13b93a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.45-85ea73",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.45-843bf7",
  "org.scalablytyped" %%% "vue__shared" % "3.2.45-ab0053")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
