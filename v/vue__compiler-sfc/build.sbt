organization := "org.scalablytyped"
name := "vue__compiler-sfc"
version := "3.2.41-53989d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__parser" % "7.19.6-1f26d3",
  "org.scalablytyped" %%% "babel__types" % "7.19.4-ea0dd0",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-deb100",
  "org.scalablytyped" %%% "postcss" % "8.4.18-a78a45",
  "org.scalablytyped" %%% "source-map" % "0.7.4-01a3bb",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-fbe867",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "vue__compiler-core" % "3.2.41-b87d18",
  "org.scalablytyped" %%% "vue__reactivity-transform" % "3.2.41-cde650")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
