organization := "org.scalablytyped"
name := "vue-clickaway"
version := "2.2-dt-20211202Z-f361fe"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__parser" % "7.19.3-2e0c60",
  "org.scalablytyped" %%% "babel__types" % "7.19.3-af77a5",
  "org.scalablytyped" %%% "csstype" % "3.1.1-0912f8",
  "org.scalablytyped" %%% "source-map" % "0.7.4-09b2a8",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "vue" % "3.2.40-f6aa2b",
  "org.scalablytyped" %%% "vue__compiler-core" % "3.2.40-b25e96",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.40-ebc42d",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.40-e02aad",
  "org.scalablytyped" %%% "vue__runtime-dom" % "3.2.40-efdd47",
  "org.scalablytyped" %%% "vue__shared" % "3.2.40-4587d5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
