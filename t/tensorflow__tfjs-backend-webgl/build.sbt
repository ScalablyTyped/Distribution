organization := "org.scalablytyped"
name := "tensorflow__tfjs-backend-webgl"
version := "4.0.0-4198e8"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "offscreencanvas" % "2019.7-dt-20220526Z-f25afc",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "tensorflow__tfjs-backend-cpu" % "4.0.0-eaffb3",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "4.0.0-7737a0",
  "org.scalablytyped" %%% "webgpu__types" % "0.1.22-16be7f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
