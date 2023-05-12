organization := "org.scalablytyped"
name := "tensorflow__tfjs-node"
version := "4.5.0-c5045f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "tensorflow__tfjs" % "4.5.0-631929",
  "org.scalablytyped" %%% "tensorflow__tfjs-backend-cpu" % "4.5.0-ea9dd3",
  "org.scalablytyped" %%% "tensorflow__tfjs-backend-webgl" % "4.5.0-cc6f1b",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "4.5.0-71608e",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "4.5.0-1b56fd",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "4.5.0-4600a6",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "4.5.0-299c8f",
  "org.scalablytyped" %%% "webgpu__types" % "0.1.32-94fcf5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
