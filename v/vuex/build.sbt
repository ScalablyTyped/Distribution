organization := "org.scalablytyped"
name := "vuex"
version := "4.1.0-c29924"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "vue__reactivity" % "3.3.2-725762",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.3.2-b7cace",
  "org.scalablytyped" %%% "vue__shared" % "3.3.2-d52317")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
