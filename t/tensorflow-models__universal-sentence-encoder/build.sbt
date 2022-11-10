organization := "org.scalablytyped"
name := "tensorflow-models__universal-sentence-encoder"
version := "1.3.3-aec2b2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "4.0.0-9eeed5",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "4.0.0-b46190",
  "org.scalablytyped" %%% "webgpu__types" % "0.1.22-6e87a0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
