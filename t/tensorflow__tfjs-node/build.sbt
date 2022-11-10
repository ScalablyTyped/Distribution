organization := "org.scalablytyped"
name := "tensorflow__tfjs-node"
version := "4.0.0-3d69b9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "tensorflow__tfjs" % "4.0.0-f52511",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "4.0.0-9eeed5",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "4.0.0-b46190",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "4.0.0-55c061",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "4.0.0-a7b382",
  "org.scalablytyped" %%% "webgpu__types" % "0.1.22-6e87a0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
