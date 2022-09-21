organization := "org.scalablytyped"
name := "tensorflow__tfjs-backend-wasm"
version := "3.20.0-0edc4f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "emscripten" % "1.39.16-dt-20220818Z-d04112",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "tensorflow__tfjs-backend-cpu" % "3.20.0-38c8ce",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "3.20.0-155a4d",
  "org.scalablytyped" %%% "webgpu__types" % "0.1.21-770a1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
