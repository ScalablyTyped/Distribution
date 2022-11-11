organization := "org.scalablytyped"
name := "vue__reactivity-transform"
version := "3.2.45-c6d09e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-97fb28",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-2e222a",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-1fe3cb",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
