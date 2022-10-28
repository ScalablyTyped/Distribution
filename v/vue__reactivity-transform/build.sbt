organization := "org.scalablytyped"
name := "vue__reactivity-transform"
version := "3.2.41-f61abc"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__parser" % "7.20.0-6157ab",
  "org.scalablytyped" %%% "babel__types" % "7.20.0-d18d74",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-deb100",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
