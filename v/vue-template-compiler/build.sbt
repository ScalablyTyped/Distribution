organization := "org.scalablytyped"
name := "vue-template-compiler"
version := "2.7.10-11705f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.40-ebc42d",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.40-e02aad",
  "org.scalablytyped" %%% "vue__shared" % "3.2.40-4587d5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
