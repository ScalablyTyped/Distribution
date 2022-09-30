organization := "org.scalablytyped"
name := "vue__server-renderer"
version := "3.2.40-885734"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.40-ebc42d",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.40-e02aad",
  "org.scalablytyped" %%% "vue__shared" % "3.2.40-4587d5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
