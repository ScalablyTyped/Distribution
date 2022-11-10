organization := "org.scalablytyped"
name := "tensorflow__tfjs-backend-wasm"
version := "4.0.0-55eb90"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "tensorflow__tfjs-backend-cpu" % "4.0.0-41b269",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "4.0.0-b46190",
  "org.scalablytyped" %%% "webgpu__types" % "0.1.22-6e87a0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
