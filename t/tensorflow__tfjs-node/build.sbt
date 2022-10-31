organization := "org.scalablytyped"
name := "tensorflow__tfjs-node"
version := "4.0.0-e99e68"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "tensorflow__tfjs" % "4.0.0-a99011",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "4.0.0-b8e581",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "4.0.0-a8303f",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "4.0.0-fb23c5",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "4.0.0-eeb4dc",
  "org.scalablytyped" %%% "webgpu__types" % "0.1.22-b31380")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
