organization := "org.scalablytyped"
name := "testing-library__vue"
version := "6.6.1-c53585"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aria-query" % "5.0-dt-20221027Z-5c6b0c",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-c798fc",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-8b54ca",
  "org.scalablytyped" %%% "csstype" % "3.1.1-ab3df7",
  "org.scalablytyped" %%% "pretty-format" % "29.3.1-6e3e57",
  "org.scalablytyped" %%% "source-map" % "0.7.4-c99616",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "testing-library__dom" % "8.19.0-a98f19",
  "org.scalablytyped" %%% "vue" % "3.2.45-930f2f",
  "org.scalablytyped" %%% "vue__compiler-core" % "3.2.45-603ae4",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.45-6cbfdc",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.45-807b1f",
  "org.scalablytyped" %%% "vue__runtime-dom" % "3.2.45-49923f",
  "org.scalablytyped" %%% "vue__shared" % "3.2.45-9a03c8",
  "org.scalablytyped" %%% "vue__test-utils" % "2.2.3-193bc2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
