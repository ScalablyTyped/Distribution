organization := "org.scalablytyped"
name := "vue__runtime-dom"
version := "3.2.45-cad865"
scalaVersion := "3.2.2-RC1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-b003b4",
  "org.scalablytyped" %%% "std" % "4.9-448261",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.45-7b628e",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.45-1fd4fb",
  "org.scalablytyped" %%% "vue__shared" % "3.2.45-c6abd0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
