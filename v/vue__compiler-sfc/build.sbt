organization := "org.scalablytyped"
name := "vue__compiler-sfc"
version := "3.3.1-f7fd84"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__parser" % "7.21.8-43580a",
  "org.scalablytyped" %%% "babel__types" % "7.21.5-fbdd8a",
  "org.scalablytyped" %%% "magic-string" % "0.30.0-c7f539",
  "org.scalablytyped" %%% "postcss" % "8.4.23-a62f41",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-781ad1",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "vue__compiler-core" % "3.3.1-44d206",
  "org.scalablytyped" %%% "vue__reactivity-transform" % "3.3.1-440203")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
