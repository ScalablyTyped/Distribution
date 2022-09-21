organization := "org.scalablytyped"
name := "vue"
version := "3.2.39-67131e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__parser" % "7.19.1-0f60fc",
  "org.scalablytyped" %%% "babel__types" % "7.19.0-70b8c8",
  "org.scalablytyped" %%% "csstype" % "3.1.1-7b6cf2",
  "org.scalablytyped" %%% "source-map" % "0.7.4-e0c113",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "vue__compiler-core" % "3.2.39-8857b4",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.39-568d09",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.39-306966",
  "org.scalablytyped" %%% "vue__runtime-dom" % "3.2.39-d6ab0c",
  "org.scalablytyped" %%% "vue__shared" % "3.2.39-9042cc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
