organization := "org.scalablytyped"
name := "vue-loader"
version := "15.10.1-e514e4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "postcss" % "8.4.19-d08411",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-cd43b3",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "vue-template-compiler" % "2.7.13-8e706f",
  "org.scalablytyped" %%% "vue__component-compiler-utils" % "3.3.0-5204f7",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.45-9276fd",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.45-b92a42",
  "org.scalablytyped" %%% "vue__shared" % "3.2.45-f2d292")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
