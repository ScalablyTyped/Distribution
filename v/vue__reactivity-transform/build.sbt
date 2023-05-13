organization := "org.scalablytyped"
name := "vue__reactivity-transform"
version := "3.3.2-9425cd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__parser" % "7.21.8-43580a",
  "org.scalablytyped" %%% "babel__types" % "7.21.5-fbdd8a",
  "org.scalablytyped" %%% "magic-string" % "0.30.0-c7f539",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
