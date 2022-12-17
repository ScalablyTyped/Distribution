organization := "org.scalablytyped"
name := "vue__compiler-sfc"
version := "3.2.45-8408df"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-5a73bf",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-b582b5",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-57a310",
  "org.scalablytyped" %%% "postcss" % "8.4.19-076895",
  "org.scalablytyped" %%% "source-map" % "0.7.4-14f7e0",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-8ee3e9",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "vue__compiler-core" % "3.2.45-dffd40",
  "org.scalablytyped" %%% "vue__reactivity-transform" % "3.2.45-3ff173")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
