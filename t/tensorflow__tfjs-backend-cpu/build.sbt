organization := "org.scalablytyped"
name := "tensorflow__tfjs-backend-cpu"
version := "4.5.0-ea9dd3"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "4.5.0-1b56fd",
  "org.scalablytyped" %%% "webgpu__types" % "0.1.32-94fcf5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
