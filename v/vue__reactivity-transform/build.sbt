organization := "org.scalablytyped"
name := "vue__reactivity-transform"
version := "3.3.4-d1fe6a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__parser" % "7.22.5-7bfc37",
  "org.scalablytyped" %%% "babel__types" % "7.22.5-26d1a8",
  "org.scalablytyped" %%% "magic-string" % "0.30.0-caad0c",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
