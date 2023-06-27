organization := "org.scalablytyped"
name := "vue__compiler-dom"
version := "3.3.4-c296f4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__parser" % "7.22.5-7bfc37",
  "org.scalablytyped" %%% "babel__types" % "7.22.5-26d1a8",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-cdb3bd",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2",
  "org.scalablytyped" %%% "vue__compiler-core" % "3.3.4-2771e2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
