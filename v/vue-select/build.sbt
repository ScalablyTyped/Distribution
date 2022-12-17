organization := "org.scalablytyped"
name := "vue-select"
version := "3.16-dt-20220823Z-1f840b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.45-433ea1",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.45-ccab93",
  "org.scalablytyped" %%% "vue__shared" % "3.2.45-86009a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
