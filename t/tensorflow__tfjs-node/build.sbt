organization := "org.scalablytyped"
name := "tensorflow__tfjs-node"
version := "4.0.0-c2869e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "tensorflow__tfjs" % "4.0.0-470f2c",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "4.0.0-512b78",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "4.0.0-7737a0",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "4.0.0-7a7129",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "4.0.0-a977ae",
  "org.scalablytyped" %%% "webgpu__types" % "0.1.22-16be7f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
