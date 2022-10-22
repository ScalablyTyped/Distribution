organization := "org.scalablytyped"
name := "testing-library__vue"
version := "6.6.1-930503"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aria-query" % "5.0-dt-20211202Z-0913f2",
  "org.scalablytyped" %%% "babel__parser" % "7.19.6-e8951f",
  "org.scalablytyped" %%% "babel__types" % "7.19.4-1978dd",
  "org.scalablytyped" %%% "csstype" % "3.1.1-775404",
  "org.scalablytyped" %%% "pretty-format" % "29.2.1-4e241c",
  "org.scalablytyped" %%% "source-map" % "0.7.4-942cbd",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "testing-library__dom" % "8.19.0-b2e0cb",
  "org.scalablytyped" %%% "vue" % "3.2.41-f9eb05",
  "org.scalablytyped" %%% "vue__compiler-core" % "3.2.41-1e8d6e",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.41-669f2b",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.41-c55f63",
  "org.scalablytyped" %%% "vue__runtime-dom" % "3.2.41-efb818",
  "org.scalablytyped" %%% "vue__shared" % "3.2.41-1967a8",
  "org.scalablytyped" %%% "vue__test-utils" % "2.1.0-4c42a1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
