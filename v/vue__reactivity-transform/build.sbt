organization := "org.scalablytyped"
name := "vue__reactivity-transform"
version := "3.2.45-b2df01"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-c798fc",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-8b54ca",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-240be7",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
