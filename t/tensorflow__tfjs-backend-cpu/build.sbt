organization := "org.scalablytyped"
name := "tensorflow__tfjs-backend-cpu"
version := "4.0.0-d6216c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "4.0.0-d8b8d9",
  "org.scalablytyped" %%% "webgpu__types" % "0.1.22-cefbd5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
