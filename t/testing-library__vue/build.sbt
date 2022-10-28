organization := "org.scalablytyped"
name := "testing-library__vue"
version := "6.6.1-f12da0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aria-query" % "5.0-dt-20221027Z-378656",
  "org.scalablytyped" %%% "babel__parser" % "7.20.0-6157ab",
  "org.scalablytyped" %%% "babel__types" % "7.20.0-d18d74",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "pretty-format" % "29.2.1-d73ee0",
  "org.scalablytyped" %%% "source-map" % "0.7.4-01a3bb",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "testing-library__dom" % "8.19.0-72033b",
  "org.scalablytyped" %%% "vue" % "3.2.41-59e1a9",
  "org.scalablytyped" %%% "vue__compiler-core" % "3.2.41-4337e8",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.41-d09629",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.41-066460",
  "org.scalablytyped" %%% "vue__runtime-dom" % "3.2.41-c257ff",
  "org.scalablytyped" %%% "vue__shared" % "3.2.41-a50cde",
  "org.scalablytyped" %%% "vue__test-utils" % "2.2.0-0732c2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
