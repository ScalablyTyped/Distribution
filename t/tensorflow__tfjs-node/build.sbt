organization := "org.scalablytyped"
name := "tensorflow__tfjs-node"
version := "4.0.0-ddcedb"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "tensorflow__tfjs" % "4.0.0-746912",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "4.0.0-64230f",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "4.0.0-c45350",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "4.0.0-84f565",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "4.0.0-d530e4",
  "org.scalablytyped" %%% "webgpu__types" % "0.1.22-b66f2a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
