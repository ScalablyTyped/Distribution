organization := "org.scalablytyped"
name := "vue__compiler-sfc"
version := "3.2.45-50442a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-c798fc",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-8b54ca",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-240be7",
  "org.scalablytyped" %%% "postcss" % "8.4.19-380a83",
  "org.scalablytyped" %%% "source-map" % "0.7.4-c99616",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-ebadc8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "vue__compiler-core" % "3.2.45-603ae4",
  "org.scalablytyped" %%% "vue__reactivity-transform" % "3.2.45-b2df01")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
