organization := "org.scalablytyped"
name := "tensorflow-models__face-detection"
version := "1.0.1-798aa4"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "offscreencanvas" % "2019.7-dt-20220526Z-457f7e",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "3.20.0-90b6cc",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "3.20.0-155a4d",
  "org.scalablytyped" %%% "webgpu__types" % "0.1.21-770a1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
