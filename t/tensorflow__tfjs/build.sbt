organization := "org.scalablytyped"
name := "tensorflow__tfjs"
version := "3.20.0-d53ba7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "3.20.0-ab77df",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "3.20.0-d049ea",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "3.20.0-2f2223",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "3.20.0-358339",
  "org.scalablytyped" %%% "webgpu__types" % "0.1.21-cf69c2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
