organization := "org.scalablytyped"
name := "tensorflow__tfjs-backend-wasm"
version := "3.20.0-efa717"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "emscripten" % "1.39.16-dt-20220818Z-11cc78",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "tensorflow__tfjs-backend-cpu" % "3.20.0-21187c",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "3.20.0-d049ea",
  "org.scalablytyped" %%% "webgpu__types" % "0.1.21-cf69c2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
