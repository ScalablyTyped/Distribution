organization := "org.scalablytyped"
name := "tensorflow-models__face-detection"
version := "1.0.1-0eb7e2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "4.0.0-6a0db7",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "4.0.0-995fa8",
  "org.scalablytyped" %%% "webgpu__types" % "0.1.22-0594d4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
