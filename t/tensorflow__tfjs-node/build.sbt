organization := "org.scalablytyped"
name := "tensorflow__tfjs-node"
version := "3.20.0-838bb8"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "tensorflow__tfjs" % "3.20.0-c2e19e",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "3.20.0-90b6cc",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "3.20.0-155a4d",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "3.20.0-e1423e",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "3.20.0-e7955d",
  "org.scalablytyped" %%% "webgpu__types" % "0.1.21-770a1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
