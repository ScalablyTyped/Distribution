organization := "org.scalablytyped"
name := "tensorflow__tfjs-backend-webgl"
version := "4.0.0-76ca41"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "tensorflow__tfjs-backend-cpu" % "4.0.0-e791be",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "4.0.0-c45350",
  "org.scalablytyped" %%% "webgpu__types" % "0.1.22-b66f2a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
