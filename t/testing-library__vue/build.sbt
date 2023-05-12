organization := "org.scalablytyped"
name := "testing-library__vue"
version := "7.0.0-55fa8b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aria-query" % "5.0-dt-20221027Z-94ebf8",
  "org.scalablytyped" %%% "babel__parser" % "7.21.8-43580a",
  "org.scalablytyped" %%% "babel__types" % "7.21.5-fbdd8a",
  "org.scalablytyped" %%% "csstype" % "3.1.2-5927f3",
  "org.scalablytyped" %%% "pretty-format" % "29.5.0-e0482b",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-781ad1",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "testing-library__dom" % "9.2.0-2cf077",
  "org.scalablytyped" %%% "vue" % "3.3.1-8b6521",
  "org.scalablytyped" %%% "vue__compiler-core" % "3.3.1-44d206",
  "org.scalablytyped" %%% "vue__reactivity" % "3.3.1-219840",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.3.1-2c0007",
  "org.scalablytyped" %%% "vue__runtime-dom" % "3.3.1-98f432",
  "org.scalablytyped" %%% "vue__shared" % "3.3.1-588fd9",
  "org.scalablytyped" %%% "vue__test-utils" % "2.3.2-486666")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
