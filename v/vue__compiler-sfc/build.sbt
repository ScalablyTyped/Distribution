organization := "org.scalablytyped"
name := "vue__compiler-sfc"
version := "3.2.39-b1a5a3"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__parser" % "7.19.1-0f60fc",
  "org.scalablytyped" %%% "babel__types" % "7.19.0-70b8c8",
  "org.scalablytyped" %%% "magic-string" % "0.26.3-bbf904",
  "org.scalablytyped" %%% "postcss" % "8.4.16-aeb026",
  "org.scalablytyped" %%% "source-map" % "0.7.4-e0c113",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-4da518",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "vue__compiler-core" % "3.2.39-8857b4",
  "org.scalablytyped" %%% "vue__reactivity-transform" % "3.2.39-885fb7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
