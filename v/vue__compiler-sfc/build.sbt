organization := "org.scalablytyped"
name := "vue__compiler-sfc"
version := "3.2.44-17e6d1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-97fb28",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-2e222a",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-1fe3cb",
  "org.scalablytyped" %%% "postcss" % "8.4.19-d08411",
  "org.scalablytyped" %%% "source-map" % "0.7.4-114bc3",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-cd43b3",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "vue__compiler-core" % "3.2.44-bd7f3f",
  "org.scalablytyped" %%% "vue__reactivity-transform" % "3.2.44-a0fdb9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
